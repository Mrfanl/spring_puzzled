package main;

import beans.Singer;
import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Test {
    public static void main(String[] args){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("component.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
      Singer xiaoming = ctx.getBean("xiaoming",Singer.class);
//        Singer xiaoming2 = ctx.getBean("xiaoming",Singer.class);
//
      xiaoming.play();
    }
}
