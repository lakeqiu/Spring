package com.lakeqiu.soring.JDKandCglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理实现
 */
public class JDKProxy implements InvocationHandler {

    // 将被增强的对象传到代理中
    private IUserDao iUserDao;
    public JDKProxy(IUserDao iUserDao){
        this.iUserDao = iUserDao;
    }

    // 生成代理的方法
    public IUserDao createProxy(){
        IUserDao userDaoProxy = (IUserDao) Proxy.newProxyInstance(iUserDao.getClass().getClassLoader(),
                iUserDao.getClass().getInterfaces(),this);
        return userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 判断方法名是不是save
        if("save".equals(method.getName())){
            System.out.println("校验权限");
            return method.invoke(iUserDao,args);
        }
        return method.invoke(iUserDao,args);
    }
}
