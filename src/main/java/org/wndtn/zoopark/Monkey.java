package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal {
    @Value("${monkey.name}")
    private String name;

    @Override
    public String makeSound() {
        return "🐒 Я поступил на дизайн!";
    }

    @Override
    public String getName() {
        return name;
    }
}
