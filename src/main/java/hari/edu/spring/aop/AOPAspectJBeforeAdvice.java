package hari.edu.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.apache.log4j.Logger;

public class AOPAspectJBeforeAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJBeforeAdvice.class);

    public void logBefore(JoinPoint joinpoint){
        logger.debug("Actions to be performed before method execution");
        logger.debug("Method Signature : "+joinpoint.getSignature());
    }
}
