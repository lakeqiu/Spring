package com.lakeqiu.soring.aspectJ;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        agency();
    }

    // 动态代理
    static void agency(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserCouster iu = (IUserCouster) applicationContext.getBean("IUserCouster");
        iu.save();
        iu.update();
        iu.delete();
        iu.find();
    }
}
