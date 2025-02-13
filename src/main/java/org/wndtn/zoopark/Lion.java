package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {
    @Value("${lion.name}")
    private String name;

    @Override
    public String makeSound() {
        return "🦁 Ррр!";
    }

    @Override
    public String getName() {
        return name;
    }
}

