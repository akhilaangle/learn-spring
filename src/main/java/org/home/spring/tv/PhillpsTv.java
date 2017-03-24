package org.home.spring.tv;

import org.home.spring.remote.PhillpsRemote;
import org.home.spring.remote.Remote;

/**
 * Created by Akhila on 3/21/2017.
 */
public class PhillpsTv implements TV {
    Remote pr= new PhillpsRemote();

    public void remote(){
        pr.name();
    }

    public void display() {
        System.out.println("display phillps tv");
    }
}
