package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPAspectJAnnotationAroundAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAnnotationAroundAdvice.class);

    @Around("execution(* hari.edu.spring.pojo.Customer.getName(..))")
    public void logAround(ProceedingJoinPoint proceedingJoinpoint) throws Throwable{
        logger.debug("Actions to be performed before the method");
        proceedingJoinpoint.proceed();
        logger.debug("Actions to be performed after the method");
    }
}
