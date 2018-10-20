package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AOPAspectJAroundAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAroundAdvice.class);

    public void logAround(ProceedingJoinPoint proceedingJoinpoint) throws Throwable{
        logger.debug("Actions to be performed before the method");
        proceedingJoinpoint.proceed();
        logger.debug("Actions to be performed after the method");
    }
}
