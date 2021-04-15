package hu.eszterhazy.animal.european;

import hu.eszterhazy.animal.Animal;

public class Dog implements Animal {

    @Override
    public void speak(){
        System.out.println("Woof");
    }
}
