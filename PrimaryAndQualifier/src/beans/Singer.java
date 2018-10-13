package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Singer {

    private String name;
    @Autowired
    @Qualifier("main")
    private Song song;

    public Singer(){}

    public void setName(String name) {
        this.name = name;
    }


   public void setSong(Song song) {
        this.song = song;
    }


    public void play(){
        System.out.println("myName is :"+this.name);
        System.out.println("mySong is :"+this.song.getContext());
    }
}
