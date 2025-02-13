package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Cat implements Animal {
    @Value("${cat.name}")
    private String name;

    @Override
    public String makeSound() {
        return "\uD83D\uDE3A МЯУУУ!";
    }

    @Override
    public String getName() {
        return name;
    }
}

