package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@Component("xiaoming")
public class Singer {
    private String name="xiaoming";
    private Song song;

    public  Singer(){
        System.out.println("this is a Singer");

    }

    public Singer(String name, Song song) {
        this.name = name;
        this.song = song;
        System.out.println("this is a Singer");

    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setSong(Song song) {
        this.song = song;
    }

    public void play(){
        System.out.println("my name is :"+this.name);
        System.out.println("my song is :"+this.song.getContext());
    }
}
