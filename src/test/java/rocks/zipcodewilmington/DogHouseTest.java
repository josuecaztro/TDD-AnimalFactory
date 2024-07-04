package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @After
    public void setUp(){
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();
    }


    @Test
    public void addDogTest(){
        Dog dog1 = new Dog("Doggy",null,6);
        Dog dog2 = new Dog("DoggyTwo",null,7);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(dog1);
        dogHouse.add(dog2);
        Integer actual = dogHouse.getNumberOfDogs();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTestById(){
        Dog dog1 = new Dog("Doggy",null,6);
        Dog dog2 = new Dog("DoggyTwo",null,7);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(dog1);
        dogHouse.add(dog2);

        dogHouse.remove(7);
        Integer actual = dogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTestByDog(){
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog("Doggy",null,2);
        Dog dog2 = new Dog("Vienna",null,3);
        dogHouse.add(dog1);
        dogHouse.add(dog2);

        dogHouse.remove(dog2);
        Integer actual = dogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog("Vienna",null,1);
        dogHouse.add(dog1);

        Integer expected = 1;
        Integer actual = dog1.getId();
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
