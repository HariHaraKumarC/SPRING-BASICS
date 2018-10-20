package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPAspectJAnnotationAfterAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAnnotationAfterAdvice.class);

    @After("execution(* hari.edu.spring.pojo.Customer.setAge(..))")
    public void logAfter(JoinPoint joinpoint){
        logger.debug("Actions to be performed after method execution");
        logger.debug("Method Signature : "+joinpoint.getSignature());
    }
}
