import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tuto.spring.service.AppConfig;
import tuto.spring.service.AppConfig2;
import tuto.spring.service.TestAService;
import tuto.spring.service.TestService;

/**
 * Created by Amine Jendoubi on 25/09/2017.
 */
public class Test {
    public static void main(String... args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        TestService ts = (TestService) context.getBean("testService");
        TestAService tsA = (TestAService) context.getBean("testA2");
        TestAService tsB = (TestAService) context2.getBean("testA2");
        System.out.println(tsB.getAge());
        System.out.println(tsA.getAge());
    }
}
