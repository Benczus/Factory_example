package hu.eszterhazy.animal.african;

import hu.eszterhazy.animal.Animal;

public class Lion implements Animal {
    @Override
    public void speak() {
        System.out.println("Roar");
    }
}
