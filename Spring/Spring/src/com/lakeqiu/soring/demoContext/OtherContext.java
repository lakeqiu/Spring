package com.lakeqiu.soring.demoContext;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 生命周期注解测试类
 */
@Service("OtherContext")
public class OtherContext {

    @PostConstruct // 初始化注解
    public void init(){
        System.out.println("生命周期注解测试类被初始化了！");
    }

    public void save(){
        System.out.println("生命周期注解测试类被执行了！");
    }

    @PreDestroy  // 销毁注解
    public void destroy(){
        System.out.println("生命周期注解测试类被销毁了！");
    }
}
