package tuto.spring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Amine Jendoubi on 25/09/2017.
 */
@Configuration
@ComponentScan(basePackages = "tuto")
public class AppConfig {
    @Bean(value = "testA2")
    public TestAService getInstance(){
        TestAService bean = new TestAService();
        bean.setAge(8l);
        return bean;
    }
}
