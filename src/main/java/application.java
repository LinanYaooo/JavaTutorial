import com.linany.spring.jdbc.dao.EmployeeDao;
import com.linany.spring.jdbc.entity.Employee;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        Employee employee = employeeDao.findById(3308);
        print(employee);
    }

    public static void print(Object o){
        System.out.println(o.toString());
    }
}
