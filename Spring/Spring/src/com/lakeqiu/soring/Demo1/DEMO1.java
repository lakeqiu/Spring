package com.lakeqiu.soring.Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DEMO1 {

    public static void main(String[] args) {
        demo1();
    }


    static void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao user = (UserDao) applicationContext.getBean("UserDao");
        user.save();
    }

}
