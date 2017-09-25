package tuto.spring.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Amine Jendoubi on 25/09/2017.
 */
@Service
public class TestAService extends TestService {
    private long age = 5l;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getName() {
        return "sonA";
    }

    @PostConstruct
    public void toStuff() {
        System.out.println("testA");
    }

    @PreDestroy
    public void doDistroy() {
        System.out.println("test distroyA");
    }
}
