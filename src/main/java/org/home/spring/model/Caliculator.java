package org.home.spring.model;

/**
 * Created by Akhila on 3/13/2017.
 */
public class Caliculator {
    /**
     * adds two numbers and return the result
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        int h = a + b;
        return h;
    }

    /**
     * multiply two numbers and return the result
     * @param a
     * @param b
     * @return
     */
     public static int multiply (int a, int b){
         int h= a*b;
         return h;
     }

    /**
     * divide the two values and return the result
     * @param a
     * @param b
     * @return
     */
     public static int division (int a, int b){
         int h= a/b;
         return h;
     }


}


