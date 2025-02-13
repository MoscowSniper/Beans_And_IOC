package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Cow implements Animal {
    @Value("${cow.name}")
    private String name;

    @Override
    public String makeSound() {
        return "\uD83D\uDC2E МуУуУуУ!";
    }

    @Override
    public String getName() {
        return name;
    }
}