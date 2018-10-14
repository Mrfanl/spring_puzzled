package main;

import beans.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("component.xml");
      Singer xiaoming = ctx.getBean("xiaoming",Singer.class);
//        Singer xiaoming2 = ctx.getBean("xiaoming",Singer.class);
//
      xiaoming.play();
    }
}
