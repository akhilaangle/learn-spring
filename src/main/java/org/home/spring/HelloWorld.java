package org.home.spring;

import org.home.spring.config.SpringConfig;
import org.home.spring.model.Caliculator;
import org.home.spring.model.Greetings;
import org.home.spring.remote.PhillpsRemote;
import org.home.spring.remote.Remote;
import org.home.spring.remote.SamsungAdRemote;
import org.home.spring.remote.SamsungRemote;
import org.home.spring.tv.PhillpsTv;
import org.home.spring.tv.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Akhila on 3/8/2017.
 */
public class HelloWorld {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        TV tv =  (ToshibaTV)ac.getBean("toshibaTV");

//        Remote rmtad = new SamsungAdRemote();
//        TV tv1 = new SamsungTV(rmtad);

        tv.remote();
        tv.display();

    }


}
