package com.lakeqiu.soring.demo2;

/**
 * set注入方法
 */
public class CarSet {
    private String name;
    private String prive;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrive(String prive) {
        this.prive = prive;
    }

    @Override
    public String toString() {
        return "CarSet{" +
                "name='" + name + '\'' +
                ", prive='" + prive + '\'' +
                '}';
    }
}
