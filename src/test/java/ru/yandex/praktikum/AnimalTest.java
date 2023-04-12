package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {
    Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void getFoodError() throws Exception {
        animal.getFood("qwerty");
    }

    @Test
    public void getFamilyMessageTest() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}