package org.home.spring.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Akhila on 3/14/2017.
 */
public class GreetingsTest {
    @Test
    public void greetShouldGiveGoodReult(){
        String s= Greetings.greet("akhila", "goodmorning" );
        Assert.assertEquals("hello akhila, goodmorning", s);
    }

}