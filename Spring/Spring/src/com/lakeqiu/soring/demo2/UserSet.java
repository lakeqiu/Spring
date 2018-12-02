package com.lakeqiu.soring.demo2;

/**
 * Set方法注入对象模型的属性
 */
public class UserSet {
    private String name;
    private CarSet carset;
    private CarSet2 carSet2;

    public void setName(String name) {
        this.name = name;
    }

    public void setCarset(CarSet carset) {
        this.carset = carset;
    }

    public void setCarSet2(CarSet2 carSet2) {
        this.carSet2 = carSet2;
    }

    @Override
    public String toString() {
        return "UserSet{" +
                "name='" + name + '\'' +
                ", carset=" + carset +
                ", carSet2=" + carSet2 +
                '}';
    }
}
