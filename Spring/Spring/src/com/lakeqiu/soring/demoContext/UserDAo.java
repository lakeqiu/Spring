package com.lakeqiu.soring.demoContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring的IOC层注解开发测试类
 */
@Component(value = "UserDAo")  // 相当于<bean id="UserDAo" class="com.lakeqiu.soring.demoContext.UserDAo"></bean>
public class UserDAo implements IUserDAo{
    // 没有set方法时，将属性注入的注解添加到属性前
    @Value("lakeqiu")
    private String name;

//    // 有set方法时，将属性注入的注解添加到set方法
//    @Value("lakeqiu")
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void save(){
        System.out.println("这是spring的IOC注解开发测试类！" + name);
    }
}
