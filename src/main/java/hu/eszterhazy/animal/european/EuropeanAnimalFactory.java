package hu.eszterhazy.animal.european;

import hu.eszterhazy.animal.Animal;
import hu.eszterhazy.animal.AnimalFactory;

public class EuropeanAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        Animal animal;
        if(name.equalsIgnoreCase("cat")){
            animal= new Cat();
        }
        else if(name.equalsIgnoreCase("dog")){
            animal= new Dog();
        }
        else if(name.equalsIgnoreCase("sheep")){
            animal= new Sheep();
        } else throw new RuntimeException("Unsupported Animal!");
        return animal;
    }
}
