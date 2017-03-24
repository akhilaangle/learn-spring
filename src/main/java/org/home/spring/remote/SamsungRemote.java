package org.home.spring.remote;

/**
 * Created by Akhila on 3/13/2017.
 */
public class SamsungRemote implements Remote{


    public void up()
    {
        System.out.println("Samsung remote up" );
    }

    public void down() {
        System.out.println("Samsung remote down");

    }
    public void name(){
        System.out.println("Samsung remote");
    }
}
