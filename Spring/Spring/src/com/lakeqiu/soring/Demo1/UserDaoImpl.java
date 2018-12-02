package com.lakeqiu.soring.Demo1;

/**
 * 用户管理Dao层接口实现类
 */
public class UserDaoImpl implements UserDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save(){
        System.out.println("UserDaoImpl被执行了。。。。。" + name);
    }
}
