package hu.eszterhazy.animal.african;

import hu.eszterhazy.animal.Animal;
import hu.eszterhazy.animal.AnimalFactory;

public class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        Animal animal;
        if(name.equalsIgnoreCase("cat")){
            animal= new Lion();
        }
        else if(name.equalsIgnoreCase("dog")){
            animal= new Hyena();
        }
        else if(name.equalsIgnoreCase("sheep")){
            animal= new Gnu();
        } else throw new RuntimeException("Unsupported Animal!");
        return animal;
    }
}
