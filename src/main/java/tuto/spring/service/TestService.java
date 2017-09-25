package tuto.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Amine Jendoubi on 25/09/2017.
 */
@Service
@Scope(scopeName = "prototype")
public class TestService {

    @Qualifier(value = "testAService")
    private TestService testService;

    public TestService getTestService() {
        return testService;
    }
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public String getName(){
        return "parent";
    }
    @PostConstruct
    public void toStuff(){
        System.out.println("test");
    }

    @PreDestroy
    public void doDistroy(){
        System.out.println("test distroy");
    }

}
