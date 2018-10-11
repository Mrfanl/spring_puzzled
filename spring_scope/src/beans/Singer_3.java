package beans;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class Singer_3 {
    private String name;
    private Song song;

    public Singer_3(){
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSong(){
        this.song=createSong();
    }

    public Song getSong() {
        return song;
    }

    @Lookup("song")
    public abstract Song createSong();



}
