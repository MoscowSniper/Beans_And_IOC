package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Dog implements Animal {
    @Value("${dog.name}")
    private String name;

    @Override
    public String makeSound() {
        return "\uD83D\uDC36 ГАВ-ГАВ";
    }

    @Override
    public String getName() {
        return name;
    }
}
