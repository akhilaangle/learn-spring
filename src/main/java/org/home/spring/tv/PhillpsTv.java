package org.home.spring.tv;

import org.home.spring.remote.PhillpsRemote;
import org.home.spring.remote.Remote;

/**
 * Created by Akhila on 3/21/2017.
 */
public class PhillpsTv implements TV {
    private Remote pt;
    public PhillpsTv (Remote pt){
        this.pt= pt;

    }

    public void remote(){
        pt.name();
    }

    public void display() {
        System.out.println("display phillps tv");
    }
}
