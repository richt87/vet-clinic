package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDateTime;

public class WhenWeCreateANewDog {

    @Test
    public void itShouldHaveAName() throws Exception {
        LocalDateTime birthday = LocalDateTime.now();

//        Dog theo = new Dog("Theo", "Husky", birthday, "Leeds");
        Dog theo = Dog.called("Theo")
                .ofBreed("Husky")
                .bornOn(birthday)
                .homeTown("Leeds")
                .build();

//        System.out.println(theo.getName());
//        System.out.println(theo.getBreed());
//        System.out.println(theo.getDateOfBirth());
//        System.out.println(theo.getHomeTown());
        Assert.assertEquals("Theo", theo.getName());
        Assert.assertEquals("Husky", theo.getBreed());
        Assert.assertEquals(birthday, theo.getDateOfBirth());
        Assert.assertEquals("Leeds", theo.getHomeTown());
    }
    @Test
    public void itShouldHaveAnOptionalFavoriteFood() throws Exception {
        LocalDateTime birthday = LocalDateTime.now();

        Dog theo = new Dog("Theo", "Husky", birthday,"Leeds", "Beef");

        Assert.assertEquals("Beef", theo.getFavoriteFood());
    }
}
