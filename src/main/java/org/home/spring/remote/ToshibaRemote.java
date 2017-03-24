package org.home.spring.remote;

/**
 * Created by Akhila on 3/24/2017.
 */
public class ToshibaRemote implements Remote {
    private String name;
    public ToshibaRemote (String name){
        this.name= name;
    }
    public void up() {
        System.out.println(name + "up");

    }

    public void down() {
        System.out.println(name + "down");

    }

    public void name() {
        System.out.println(name);

    }
}
