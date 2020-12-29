import com.linany.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 将Junit4的执行权交由Spring Test, 在测试用例行自动化执行IoC容器
@RunWith(SpringJUnit4ClassRunner.class)
// 控制IOC加载哪个配置文件
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringTestor {
    @Resource
    private UserService userService;

    @Test
    public void testUserService(){
        userService.createUser();
    }
}
