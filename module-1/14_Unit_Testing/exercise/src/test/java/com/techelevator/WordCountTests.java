package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {


    @Test
    public void single_word_repeated() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> map = new HashMap<>();
        map.put("Beetlejuice", 3);
        Assert.assertEquals(map, wordCount.getCount(new String[] {"Beetlejuice", "Beetlejuice", "Beetlejuice"}));
    }

    @Test
    public void single_word_once() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> map = new HashMap<>();
        map.put("Beetlejuice", 1);
        Assert.assertEquals(map, wordCount.getCount(new String[] {"Beetlejuice"}));
    }
    @Test
    public void batman_returns_returns_2() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> map = new HashMap<>();
        map.put("Beetlejuice", 1);
        map.put("Batman", 2);
        Assert.assertEquals(map, wordCount.getCount(new String[] {"Beetlejuice", "Batman", "Batman"}));
    }
    @Test
    public void two_null() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 2);
        Assert.assertEquals(map, wordCount.getCount(new String[] {null, null}));
    }
    @Test
    public void empty_array_should_return_empty_map() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> map = new HashMap<>();
        Assert.assertEquals(map, wordCount.getCount(new String[] {}));
    }

}
