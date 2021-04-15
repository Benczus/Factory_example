package hu.eszterhazy;

import hu.eszterhazy.animal.AbstractFactory;
import hu.eszterhazy.animal.AnimalFactory;
import hu.eszterhazy.animal.african.AfricanAnimalFactory;
import hu.eszterhazy.animal.european.EuropeanAnimalFactory;
import hu.eszterhazy.animal.european.Sheep;

public class Main {

    public static void main(String[] args){

        AnimalFactory animalFactory = AbstractFactory.getAnimalFactory("european");
        Client.demo2(animalFactory, 10);

        

    }


}
