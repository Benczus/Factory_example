package hu.eszterhazy.animal;

import hu.eszterhazy.animal.african.AfricanAnimalFactory;
import hu.eszterhazy.animal.european.EuropeanAnimalFactory;

public class AbstractFactory {

  public static AnimalFactory getAnimalFactory(String name){
      AnimalFactory animalFactory;
      if (name.equalsIgnoreCase("european")){
          animalFactory= new EuropeanAnimalFactory();
      }else
      if (name.equalsIgnoreCase("african")){
          animalFactory= new AfricanAnimalFactory();
      } else throw new RuntimeException();
      return animalFactory;
  }


}
