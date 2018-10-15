package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class AOPBeforeAdvice implements MethodBeforeAdvice {

    private static final Logger logger=Logger.getLogger(AOPBeforeAdvice.class);

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
       logger.debug("Actions to be performed before method execution");
       logger.debug("Printing the method details");
       logger.debug("Method Name : "+ method.getName());
       logger.debug("Method Return Type : "+ method.getReturnType());
    }
}
