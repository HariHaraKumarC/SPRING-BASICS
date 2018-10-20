package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOPAspectJAnnotationBeforeAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAnnotationBeforeAdvice.class);

    @Before("execution(* hari.edu.spring.pojo.Customer.setName(..))")
    public void logBefore(JoinPoint joinpoint){
        logger.debug("Actions to be performed before method execution");
        logger.debug("Method Signature : "+joinpoint.getSignature());
    }
}
