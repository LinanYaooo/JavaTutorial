import java.nio.charset.Charset;

public class Variable {


    private static void print(Object msg, char ln){
        if (ln=='T'){
            System.out.println(msg);
        }else{
            System.out.print(msg);
        }
    };

    private static void dis(Object msg){
        System.out.println(msg);
    };


    public static void main(String[] args) {
        // Unicode 编码，万国码
        char c='\u0f5d';
        print(c,'T');

        // 字符串字面值
        String str = "草泥马";
        print(str.length() + c,'T');
        String[] stringList = {"CCCC","CCCC"};
        Display.printf(stringList);

        // 获取 JVM 默认编码字符集
        print(Charset.defaultCharset(),'T');

        // 科学计数法
        double d=1.23E10;
        print(d + 123,'T');

        // 数据类型转换 - 自动类型转换(隐式转换) 或者 强制类型转换(会引起丢失)
        float abc = 111;
        double cba = (double)abc;
        print(cba,'T');

        // 如果 a 范围 比 b 类型大， b 转换为 a 需要进行强制转换
        Object e = (float)1234;
        print(e.getClass().toString(),'T');

        // 常量, final 修饰 变量, 常量无法被修改
        final double PI = 3.1415926;
        final float PII = 1;
        float a = 1.2f;


    }
}
