package com.lakeqiu.soring.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 */
public class MyAspectXML {

    // 前置通知：获取切入点信息
    public void checkPri(JoinPoint joinPoint){
        System.out.println("切面类-----前置通知！" + joinPoint);
    }

    // 后置通知:获取方法的返回值
    public void afterreturn(Object res){
        System.out.println("切面类-----后置通知" + res);
    }

    // 环绕通知：目标方法执行之前和之后执行(可以阻住方法的运行)
    public Object round(ProceedingJoinPoint Point) throws Throwable{
        System.out.println("环绕通知----方法运行前通知");
        // 执行目标方法获取其返回值
        Object obj = Point.proceed();
        System.out.println("环绕通知----方法运行后通知");
        return obj;
    }

    // 异常抛出通知
    public void throwings(Throwable ex){
        System.out.println("异常抛出通知" + ex.getMessage());
    }


    // 最终通知
    public void after(){
        System.out.println("最终通知");
    }

}
