package com.lakeqiu.soring.demoContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DEMO {
    public static void main(String[] args) {
        Save();
        Look();
        other();

    }

    // Spring的IOC层注解开发测试类
    static void Save(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDAo use = (IUserDAo) applicationContext.getBean("UserDAo");
        use.save();
    }

    // 类和属性注入实现测试类
    static void Look(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserServer server = (IUserServer) applicationContext.getBean("UserServerImpl");
        server.look();
    }

    // 生命周期注解测试类
    static void other(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        OtherContext o = (OtherContext) applicationContext.getBean("OtherContext");
        o.save();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
