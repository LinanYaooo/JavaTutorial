package com.linany.oop;

/**
 * 继承
 * 子类只能继承非私有成员
 */
public class ThingsSon extends Things {
    public double weight;


    public ThingsSon(String name, int size, double height) {
        super(name, size, height);

        this.setSize(333);
        this.h.showl(this.getSize());
        this.type = "qwe";
    }

    // 方法重写
    // 子类中重写父类,
    // 方法名相同, 参数列表相同;

    public void setSize(){

    }

}
