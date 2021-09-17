package com.artineer.spring_lecture.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AComponent {

    BComponent bComponent;
    CComponent cComponent;
    DComponent dComponent;
    //실험

    @Autowired
    public AComponent(BComponent bComponent, CComponent cComponent, DComponent dComponent) {
        this.bComponent = bComponent; // 생성자 주입 -> 제일 권장, 실무에서 가장 많이 쓰임. 순환참조를 위해 사용.
        this.cComponent = cComponent;
        this.dComponent = dComponent;
    }
   /* public void setbComponent(BComponent bComponent) {
        this.bComponent = bComponent; // Setter 주입
    }*/
}
