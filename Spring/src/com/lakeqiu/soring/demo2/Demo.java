package com.lakeqiu.soring.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        carconstruct();
        carset();
        userset();
        collectionbean();
    }

    // 构造方法属性注入
    static void carconstruct(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CarConstruct car1 = (CarConstruct) applicationContext.getBean("CarConstruct");
        System.out.println(car1);
    }

    // Set方法属性注入
    static void carset(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CarSet car2 = (CarSet) applicationContext.getBean("CarSet");
        System.out.println(car2);
    }

    // Set方法注入对象类型的属性
    static void userset(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserSet user = (UserSet) applicationContext.getBean("UserSet");
        System.out.println(user);
    }

    static void collectionbean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CollectionBean a = (CollectionBean) applicationContext.getBean("CollectionBean");
        System.out.println(a);
    }
}
