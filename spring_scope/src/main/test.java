package main;

import aware.CommandManager;
import beans.Singer;
import beans.Singer_3;
import beans.Song;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_scope.xml");
       Singer_3 xiaoming = ctx.getBean("xiaoming_3",Singer_3.class);
        xiaoming.setSong();
        xiaoming.setSong();



    }
}
