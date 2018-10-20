package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AOPAspectJAfterThrowingAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAfterThrowingAdvice.class);

    public void logAfterThrowing(JoinPoint joinpoint, Throwable error){
        logger.debug("Actions to be performed when method throws exception");
        logger.debug("Method Signature : "+joinpoint.getSignature());
        logger.debug("Exception: "+ error);
    }
}
