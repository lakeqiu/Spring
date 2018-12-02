import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1.创建一个Spring的IOC容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        // 2.从IOC容器中获取Bean实例
        demo1 a = (demo1)applicationContext.getBean("demo1");

        // 3.调用say方法
        a.Say();
    }

}
