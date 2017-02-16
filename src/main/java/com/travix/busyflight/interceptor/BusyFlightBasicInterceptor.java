package com.travix.busyflight.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.travix.busyflight.exception.BusyFlightBaseException;

/**
 * 
 * @author ktawfik
 */
@Aspect
@Controller
public class BusyFlightBasicInterceptor {
	// still not working, hence I used sysout
	private Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Around("execution(* com.travix.busyflight.supplier..*Service.*(..))")
	public Object apiCallAspect(ProceedingJoinPoint joinPoint) throws Throwable {
		Object o = null;
		StringBuilder sb = new StringBuilder("Entering ");
		long st = System.currentTimeMillis();
		sb.append(getMethodInfo(joinPoint)).append(' ');
		sb.append(getParameters(joinPoint));
		System.out.println(sb.toString());
		o = joinPoint.proceed();
		System.out.println("Total time taken:" + (System.currentTimeMillis() - st));
		return o;
	}

	private String getParameters(JoinPoint joinPoint) {
		StringBuilder sb = new StringBuilder();
		try {
			Object[] params = joinPoint.getArgs();
			for (int i = 0; i < params.length; i++) {
				if (params[i] != null)
					sb.append("Parameter").append(i + 1).append(" = ").append(params[i].toString()).append(", ");
			}
		} catch (Exception th) {
			LOGGER.trace("Parameters: {}", th);
		}
		return sb.toString();
	}

	private String getMethodInfo(JoinPoint joinPoint) throws Exception {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(joinPoint.getTarget().getClass().getSimpleName()).append(" -> ");
			sb.append(joinPoint.getSignature().getName());
		} catch (Exception th) {
			LOGGER.trace("Method and user info: {}", th);
		}
		return sb.toString();
	}

}
