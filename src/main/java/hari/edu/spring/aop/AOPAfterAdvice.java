package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AOPAfterAdvice implements AfterReturningAdvice {

    private static final Logger logger=Logger.getLogger(AOPAfterAdvice.class);

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        logger.debug("Actions to be performed after method execution...");
    }
}
