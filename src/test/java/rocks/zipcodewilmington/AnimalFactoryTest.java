package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        AnimalFactory animalFactory = new AnimalFactory();
        DogHouse dogHouse = new DogHouse();
        Dog newDog = animalFactory.createDog("Scooby",new Date());
        String actual1 = newDog.getName();
        String expected = "Scooby";
//        Dog expected = dogHouse.getDogById(0);
        Assert.assertEquals(expected, actual1);
    }


}
