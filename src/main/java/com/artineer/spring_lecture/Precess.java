package com.artineer.spring_lecture;

import com.artineer.spring_lecture.component.AComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Precess implements ApplicationRunner {
    AComponent aComponent;

    @Autowired
    public void Process (AComponent aComponent)
    {
        this.aComponent =aComponent;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(aComponent);

    }
}
