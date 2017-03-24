package org.home.spring.tv;
import org.home.spring.remote.*;

/**
 * Created by Akhila on 3/24/2017.
 */
public class ToshibaTV implements TV {
    private Remote toshibaRemote;
    public ToshibaTV (Remote rt){
        this.toshibaRemote= rt;
    }
    public void display() {
        System.out.println("Toshiba tv display");
    }

    public void remote() {
        toshibaRemote.name();
    }
}
