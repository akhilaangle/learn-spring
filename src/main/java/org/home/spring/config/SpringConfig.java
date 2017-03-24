package org.home.spring.config;

import org.home.spring.remote.SamsungRemote;
import org.home.spring.tv.*;
import org.home.spring.remote.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Akhila on 3/23/2017.
 */
@Configuration
public class SpringConfig {
    @Bean
    public Remote samsungRemote() {
        SamsungRemote sr = new SamsungRemote("SamsungRemote");
        return sr;
    }

    @Bean
    public Remote philipsRemote() {
        PhillpsRemote pr = new PhillpsRemote("PhillpsRemote");
        return pr;
    }

    @Bean(name = "akhilaremote")
    public Remote toshibaRemote() {
        ToshibaRemote tr = new ToshibaRemote("ToshibaRemote");
        return tr;
    }

    @Bean
    public TV  philipsTV(@Qualifier("philipsRemote") Remote remote) {
        PhillpsTv pt = new PhillpsTv(remote);
        return pt;
    }


    @Bean
    public TV samsungTV(@Qualifier("samsungRemote") Remote r){
        SamsungTV st= new SamsungTV(r);
            return st;

    }

    @Bean
    public TV toshibaTV(@Qualifier("akhilaremote") Remote remote){
        ToshibaTV Tt= new ToshibaTV(remote);
        return Tt;

    }
}
