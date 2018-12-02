package com.lakeqiu.soring.JDKandCglib;

public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存！");
    }

    @Override
    public void creat() {
        System.out.println("生成！");
    }

    @Override
    public void delete() {
        System.out.println("删除！");
    }
}
