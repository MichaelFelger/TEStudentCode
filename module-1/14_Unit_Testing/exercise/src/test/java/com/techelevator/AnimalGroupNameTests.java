package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void non_animal_input_should_return_unknown() {
        // what
        AnimalGroupName animalGroup = new AnimalGroupName();
        // how
        String herd = animalGroup.getHerd("fireTruck");
        // result
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void correct_animal_group_verification() {
        // what
        AnimalGroupName animalGroup = new AnimalGroupName();
        // how
        String herd = animalGroup.getHerd("crow");
        // result
        Assert.assertEquals("Murder", herd);
    }

    @Test
    public void case_insensitivity_verification() {
        // what
        AnimalGroupName animalGroup = new AnimalGroupName();
        // how
        String herd = animalGroup.getHerd("CrocoDiLe");
        // result
        Assert.assertEquals("Float", herd);
    }

    @Test
    public void null_input_should_return_unknown() {
        // what
        AnimalGroupName animalGroup = new AnimalGroupName();
        // how
        String herd = animalGroup.getHerd(null);
        // result
        Assert.assertEquals("unknown", herd);
    }



}
