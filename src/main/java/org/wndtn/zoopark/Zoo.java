package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Zoo {
    private final List<Animal> animals;

    @Autowired
    public Zoo(@Qualifier("lion") Animal lion,
               @Qualifier("parrot") Animal parrot,
               @Qualifier("elephant") Animal elephant,
               @Qualifier("monkey") Animal monkey,
               @Qualifier("cat") Animal cat,
               @Qualifier("dog") Animal dog,
               @Qualifier("cow") Animal cow) {
        this.animals = List.of(lion, parrot, elephant, monkey, cat, dog, cow);

    }

    public void makeSounds() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }
    }
}