package hu.eszterhazy;

import hu.eszterhazy.animal.Animal;
import hu.eszterhazy.animal.AnimalFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void demo2(AnimalFactory animalFactory, int n){
        List<Animal> animalList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            if (i % 3 == 0){
                animalList.add(animalFactory.createAnimal("cat"));
            }
            if (i % 3 == 1){
                animalList.add(animalFactory.createAnimal("dog"));
            }
            if (i % 3 == 2){
                animalList.add(animalFactory.createAnimal("sheep"));
            }
        }

        for (Animal animal:animalList
             ) {
            animal.speak();
        }

    }

    public static void demo(Animal animal){
        animal.speak();
    }
}
