package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        //given cat data
//        String givenName = "Garfield";
        //cat is constructed
        Cat cat = new Cat(null, null, null);
        //retrieve data from the cat
        cat.setName("Garfield");
        //label your actual vs expected
        String actualName = cat.getName();
        String expectedName = "Garfield";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setBirthDateTest() {
        Cat cat = new Cat();
        Date actualDate = new Date();
        cat.setBirthDate(actualDate);
        Date expectedDate = cat.getBirthDate();
        Assert.assertEquals(actualDate, expectedDate);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat();
        Food chips = new Food();
        cat.eat(chips);
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void idTest(){
        Cat cat = new Cat(null,null,4);
        Integer expected = 4;
        Integer actual = cat.getId();
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat();
        boolean expected = (cat instanceof Animal);
        boolean actual = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat();
        boolean expected = (cat instanceof Mammal);
        boolean actual = true;
        Assert.assertEquals(expected,actual);
    }


}
