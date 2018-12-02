package com.lakeqiu.soring.JDKandCglib;

public class Demo {
    public static void main(String[] args) {
        IUserDao user = new UserDaoImpl();
        // 创建代理
        IUserDao proxy = new JDKProxy(user).createProxy();
        proxy.creat();
        proxy.save();
        proxy.delete();
    }
}
