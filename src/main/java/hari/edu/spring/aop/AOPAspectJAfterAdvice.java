package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AOPAspectJAfterAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAfterAdvice.class);

    public void logAfter(JoinPoint joinpoint){
        logger.debug("Actions to be performed after method execution");
        logger.debug("Method Signature : "+joinpoint.getSignature());
    }
}
