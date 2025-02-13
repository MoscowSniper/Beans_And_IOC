package org.wndtn.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Zoo {
    private final List<Animal> animals;

    @Autowired
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void makeSounds() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.makeSound());
        }
    }
}