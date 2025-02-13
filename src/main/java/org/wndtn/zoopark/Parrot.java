package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot implements Animal {
    @Value("${parrot.name}")
    private String name;

    @Override
    public String makeSound() {
        return "🦜 Чирик-чирик!";
    }

    @Override
    public String getName() {
        return name;
    }
}
