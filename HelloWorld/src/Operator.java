
public class Operator {
    public static void main(String[] args) {
        // ++ 自增， -- 自减
        int result;
        int num1=10, num2=5;
        // 字符串连接运算
        Display dis = new Display();
        dis.dis("" + num1 + num2);
        // 除法, 分子分母都是整形， 结果为整除后结果
        dis.dis(13/num2);
        dis.dis(13/(float)num2);
        // 求余
        dis.dis(1.3%num2);
        // 自增自减
        double test = --num2;
        dis.dis(test);



        // 运算符优先级

    }
}
