package hari.edu.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ThrowsAdvice;

@Aspect
public class AOPAspectJAfterAnnotationThrowAdvice implements ThrowsAdvice {

    private static final Logger logger=Logger.getLogger(AOPAspectJAfterAnnotationThrowAdvice.class);

    @AfterThrowing(value = "execution(* hari.edu.spring.pojo.Customer.checkAge(..))",throwing = "error")
    public void logAfterThrowing(JoinPoint joinpoint, Throwable error){
        logger.debug("Actions to be performed when method throws exception");
        logger.debug("Method Signature : "+joinpoint.getSignature());
        logger.debug("Exception: "+ error);
    }
}
