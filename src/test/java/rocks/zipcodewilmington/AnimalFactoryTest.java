package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @After
    public void setUp(){
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();
    }


    @Test
    public void createDogTest(){
        AnimalFactory animalFactory = new AnimalFactory();
        DogHouse dogHouse = new DogHouse();
        Dog newDog = animalFactory.createDog("Scooby",new Date());
        String actual1 = newDog.getName();
        String expected = "Scooby";
        Date expected2 = new Date();
        Date actual2 = newDog.getBirthDate();
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void createCatTest(){
        AnimalFactory animalFactory = new AnimalFactory();
        CatHouse catHouse = new CatHouse();
        Date expected2 = new Date();
        Cat newCat = animalFactory.createCat("Tofu",new Date());
        String actual1 = newCat.getName();
        String expected = "Tofu";
        Date actual2 = newCat.getBirthDate();
        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected2, actual2);
    }


}
