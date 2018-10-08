package main;

import beans.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("idref_check.xml");
        Performer xiaoming = (Performer) ctx.getBean("xiaoming");
        xiaoming.play();
    }
}
