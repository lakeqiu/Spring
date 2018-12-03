package com.lakeqiu.soring.demoContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类和属性注入实现测试类
 */
@Service("UserServerImpl")
public class UserServerImpl implements IUserServer {

//    @Autowired
//    @Qualifier("UserDAo")
    @Resource(name = "UserDAo")
    private UserDAo userDAo;

    @Override
    public void look() {
        System.out.println("类和属性注入测试类");
        userDAo.save();
    }
}
