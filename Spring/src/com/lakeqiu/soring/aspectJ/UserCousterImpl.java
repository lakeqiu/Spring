package com.lakeqiu.soring.aspectJ;

/**
 * 动态代理实现类
 * 切入点
 * 目标类
 */
public class UserCousterImpl implements IUserCouster {
    @Override
    public void save() {
        System.out.println("动态代理----保存！");
    }

    @Override
    public String update() {
        System.out.println("动态代理----更新！");
        return "updata方法的返回值";
    }

    @Override
    public void delete() {
        System.out.println("动态代理---删除！");
    }

    @Override
    public void find() {
        System.out.println("动态代理---寻找！");
        int i = 10/0;
    }
}
