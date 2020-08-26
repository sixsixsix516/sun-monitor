package com.sixsixsix516.filter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author sun 2020/8/26 17:49
 */
@Aspect
@Component
public class RequestAop {

    @Around("execution(* com.sixsixsix516..*.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();

        try {
            //前置通知
            System.out.println("(前置通知)The method " + methodName + " begins with " + Arrays.asList(proceedingJoinPoint.getArgs()));
            //执行目标方法
            result = proceedingJoinPoint.proceed();
            //返回通知
            System.out.println("(返回通知)The method " + methodName + " ends with " + result);
        } catch (Throwable e) {
            //异常通知
            System.out.println("(异常通知)The method " + methodName + " occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("(后置通知)The method " + methodName + " ends");

        return result;
    }


}
