package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPAspectJAnnotationAfterReturningAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAnnotationAfterReturningAdvice.class);

    @AfterReturning(value = "execution(* hari.edu.spring.pojo.Customer.getAge(..))",returning = "result")
    public void logAfterReturning(JoinPoint joinpoint, Object result){
        logger.debug("Actions to be performed after method execution (with method result interception)");
        logger.debug("Method Signature : "+joinpoint.getSignature());
        logger.debug("Method Result : "+result);
    }
}
