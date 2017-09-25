package tuto.spring.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Amine Jendoubi on 25/09/2017.
 */
@Service
public class TestBService extends TestService {
    public String getName(){
        return "sonB";
    }
    @PostConstruct
    public void toStuff(){
        System.out.println("testB");
    }

    @PreDestroy
    public void doDistroy(){
        System.out.println("test distroyB");
    }
}
