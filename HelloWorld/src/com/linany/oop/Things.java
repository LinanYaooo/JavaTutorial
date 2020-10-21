package com.linany.oop; // package must put first line
import com.linany.display.Show;



/**
 * ======= 面向对象的封装 =======
 *  特点 只能通过特定方法实现信息访问
 *  实现封装 - 修改属性可见性， 改为 私有， 类内访问， 禁止类外访问
 *  创建共有 getter setter 方法
 *  在 getter setter 方法中加入对属性的控制语句 - 例如合法性验证
 */
public class Things {


    {
        System.out.println("老子是构造代码块");
    }

    static{
        System.out.println("老子是静态代码块");
    }

    // 静态属性
    public static String Name;

    // 属性
    // 修改属性可见性：设置为private， 只能在类内访问
    public String type;
    private String name;
    private int size;
    private double height;
    Show h = new Show();

    // 在在·1
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize(){
        this.h.showl(this.size);
        return this.size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Things{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", height=" + height +
                ", h=" + h +
                '}';
    }

    // 构造方法 - 配合 New 使用， 构造方法方法名必须和类名相同
    // 构造方法无返回值
    // 只能在实例化时调用
    // 系统在无构造时会自动添加无参构造方法
    // 通常通过构造方法完成属性设置操作
    // this 代表当前对象
    // 构造方法不能被成员方法调用
    public Things(String name, int size, double height) {
        h.show("comming!");
        this.setName(name);
        this.setSize(size);
        this.height = height;
    }





}
