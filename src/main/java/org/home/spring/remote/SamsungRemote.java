package org.home.spring.remote;

/**
 * Created by Akhila on 3/13/2017.
 */
public class SamsungRemote implements Remote{

    private String name;

    public SamsungRemote(String name) {
        this.name = name;
    }
    public void up()
    {
        System.out.println(name+" up" );
    }

    public void down() {
        System.out.println(name+" down");

    }
    public void name(){
        System.out.println(name);
    }
}
