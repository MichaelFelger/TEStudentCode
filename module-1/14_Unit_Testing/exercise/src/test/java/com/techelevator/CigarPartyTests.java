package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    @Test
    public void happy_path_successful_weekday_party() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(50, false);
        // result
        Assert.assertEquals(true, actual);

    }

    @Test
    public void weekend_party_with_too_few_cigars_is_unsuccessful() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(39, true);
        // result
        Assert.assertEquals(false, actual);

    }

    @Test
    public void squirrel_brought_a_million_cigars_last_weekend() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(1000000, true);
        // result
        Assert.assertEquals(true, actual);

    }

    @Test
    public void edge_case_successful_weekday_party() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(40, false);
        // result
        Assert.assertEquals(true, actual);

    }

    @Test
    public void lower_edge_case_unsuccessful_weekday_party() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(39, false);
        // result
        Assert.assertEquals(false, actual);

    }

    @Test
    public void upper_edge_case_unsuccessful_weekday_party() {
        // what
        CigarParty cigarParty = new CigarParty();
        // how
        boolean actual = cigarParty.haveParty(61, false);
        // result
        Assert.assertEquals(false, actual);

    }


}
