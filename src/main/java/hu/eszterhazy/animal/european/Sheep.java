package hu.eszterhazy.animal.european;

import hu.eszterhazy.animal.Animal;

public class Sheep implements Animal {

    @Override
    public void speak(){
        System.out.println("Baah");
    }
}
