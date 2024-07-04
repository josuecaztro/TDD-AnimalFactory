package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @After
    public void setUp(){
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
    }

    @Test
    public void addCatTest(){
        Cat cat1 = new Cat("Kitty",null,6);
        Cat cat2 = new Cat("Kitty2",null,7);
        CatHouse catHouse = new CatHouse();
        catHouse.add(cat1);
        catHouse.add(cat2);
        Integer actual = catHouse.getNumberOfCats();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTestById(){
        CatHouse catHouse = new CatHouse();
        Cat cat1 = new Cat("Jinx",null,2);
        Cat cat2 = new Cat("Jinx2",null,3);
        catHouse.add(cat1);
        catHouse.add(cat2);

        catHouse.remove(3);
        Integer actual = catHouse.getNumberOfCats();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTestByCat(){
        CatHouse catHouse = new CatHouse();
        Cat cat1 = new Cat("Jinx",null,2);
        Cat cat2 = new Cat("Jinx2",null,3);
        catHouse.add(cat1);
        catHouse.add(cat2);

        catHouse.remove(cat2);
        Integer actual = catHouse.getNumberOfCats();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest(){
        CatHouse catHouse = new CatHouse();
        Cat cat1 = new Cat("Jinx",null,1);
        catHouse.add(cat1);

        Integer expected = 1;
        Integer actual = cat1.getId();
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void getNumberOfCatTest (){
        CatHouse catHouse = new CatHouse();
        Cat cat1 = new Cat("Jinx",null,1);
        Cat cat2 = new Cat("Jinx2",null,3);

        catHouse.add(cat1);
        catHouse.add(cat2);

        Integer expected = 2;
        Integer actual = catHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }






}
