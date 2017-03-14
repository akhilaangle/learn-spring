package org.home.spring;

import org.home.spring.model.Caliculator;
import org.home.spring.model.Greetings;

/**
 * Created by Akhila on 3/8/2017.
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello Wolrd");
        String s= Greetings.greet( "ramesh", "how are you?");
        System.out.println(s);
        int c= Caliculator.add(100, 150);
        System.out.println("Addition =" +  c);
        int a= Caliculator.multiply(34, 40);
        System.out.println("Multiplication = " + a);
        int b= Caliculator.division(72, 4);
        System.out.println("Division = "+ b);
        // add 100, 150.// multiply 34, 40
                // division 72, 4
    }

}
