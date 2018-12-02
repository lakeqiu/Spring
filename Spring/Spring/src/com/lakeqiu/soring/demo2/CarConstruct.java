package com.lakeqiu.soring.demo2;

/**
 * 属性注入方式：构造方法注入
 */
public class CarConstruct {
    private String name;
    private int prive;

    CarConstruct(String name, int prive){
        this.name = name;
        this.prive = prive;
    }

    @Override
    public String toString() {
        return "CarConstruct{" +
                "name='" + name + '\'' +
                ", prive=" + prive +
                '}';
    }
}
