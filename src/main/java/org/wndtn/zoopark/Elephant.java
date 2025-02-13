package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Elephant implements Animal {
    @Value("${elephant.name}")
    private String name;

    @Override
    public String makeSound() {
        return "🐘 УуУУУУууУ!";
    }

    @Override
    public String getName() {
        return name;
    }
}
