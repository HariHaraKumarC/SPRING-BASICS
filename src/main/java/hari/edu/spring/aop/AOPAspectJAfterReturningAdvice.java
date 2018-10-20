package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AOPAspectJAfterReturningAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAfterReturningAdvice.class);

    public void logAfterReturning(JoinPoint joinpoint, Object result){
        logger.debug("Actions to be performed after method execution (with method result interception)");
        logger.debug("Method Signature : "+joinpoint.getSignature());
        logger.debug("Method Result : "+result);
    }
}
