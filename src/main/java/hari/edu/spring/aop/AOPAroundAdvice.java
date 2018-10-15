package hari.edu.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class AOPAroundAdvice implements MethodInterceptor {

    private static final Logger logger=Logger.getLogger(AOPAroundAdvice.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        logger.debug("Actions to be performed before method execution...");
        try{
            Object result=methodInvocation.proceed();
            logger.debug("Actions to be performed after method execution...");
            return result;
        }catch (IllegalArgumentException e){
            logger.debug("Actions to be performed when method throws exception...");
            throw e;
        }
    }
}
