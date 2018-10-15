package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class AOPAfterThrowAdvice implements ThrowsAdvice {

    private static final Logger logger=Logger.getLogger(AOPAfterThrowAdvice.class);

    public void afterThrowing(IllegalArgumentException e){
        logger.debug("Exception Occurs :" +e);
        logger.debug("Actions to be performed when the method throws exception...");
    }
}
