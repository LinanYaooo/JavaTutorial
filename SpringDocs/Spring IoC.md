# Spring IoC II

> 元数据注解: 为对象提供辅助信息
- @primary
  - 类型装配时出现多个相同类型的对象，用此注解标注优先被注入的对象
- @PostConstruct
  - 等于XML配置中的 init-method 配置的注解版本
- @PreDestory
  - 相当于 destory-method 配置的注解版本
- @Scope
  - 设置对象的 Scope 属性
- @Value
  - 为属性注入静态类型

> Value 注解的使用
- 创建配置文件
- 在命名空间配置文件中引入配置文件
- 在@Value注解中引如配置名称

> Java Config 配置 IOC 容器
- 完全摆脱 XML 配置文件束缚
- 可以在编译时进行依赖检查，不容易出错

> Java Config 核心注解
- @Configuration 
  - 描述类，说明当前类时Java Config 配置类，完全代替XML文件
- @Bean 描述方法，方法返回对象将被IOC容器管理, BeanId 默认为方法名
- @ImportResource 描述累类，加载静态文件，可使用@Value注解获取
- @ComponentScan 描述类,同 context:component-scan字标签

> Config 类
- 模拟配置文件，封装若干Bean的获取方法，方法通过
  @Bean注解，方法名代表 BeanId

> Java Config 对象依赖注入
- 在 Config 类中的方法内，给需要注入对象的类的Bean方法提供注入的对象的入参，并在方法内书写set

> Java Config 拥有较好的开发体验，但是代码变更结果是频繁编译，因此 Java Config 配置 IOC 容器的模式被Spring Boot敏捷开发框架



> Spring Test
- 与 Junit 整合实现模块测试
- 1.依赖 spring-test模块
- 2.利用@RunWith @ContextConfiguration描述测试用例类
- 3.测试用例类从容器获取对象完成测试用例的执行
- RunWith 代表 Junit 的执行权先交由SpringTest
- ContextConfiguration 表示在测试执行前自动初始化IOC容器；


> Spring IOC 总结回顾
- Spring快速入门
- Spring XML 配置
- 对象实例化配置，并将其管理起来
- 依赖注入配置，将数据或者对象设置到另一个对象中
- 注解与Java Config 主要依赖注解实现 IOC 容器配置
- Spring单元测试
