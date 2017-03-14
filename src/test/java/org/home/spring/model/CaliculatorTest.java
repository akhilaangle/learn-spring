package org.home.spring.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Akhila on 3/14/2017.
 */
public class CaliculatorTest {

    @Test
    public void addShouldGiveProperResult(){
        int result = Caliculator.add(100, 200);
        Assert.assertEquals(300, result);
    }

    @Test
    public void multiplyShouldGiveProperResult(){
        int output= Caliculator.multiply(2,4);
        Assert.assertEquals(8,output);
    }

}