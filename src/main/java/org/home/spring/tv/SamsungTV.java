package org.home.spring.tv;

import org.home.spring.remote.PhillpsRemote;
import org.home.spring.remote.Remote;
import org.home.spring.remote.SamsungAdRemote;
import org.home.spring.remote.SamsungRemote;

/**
 * Created by Akhila on 3/21/2017.
 */
public class SamsungTV implements TV {

    private Remote sr;

    public SamsungTV(Remote sr) {
        this.sr = sr;
    }

    public void remote() {
        sr.name();
    }

    public void display (){
        System.out.println("display samsung tv");
    }

}
