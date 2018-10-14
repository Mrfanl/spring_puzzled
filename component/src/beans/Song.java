package beans;

import org.springframework.stereotype.Component;

//@Component("song1")
public class Song {
    private String context="如约而至";

    public Song() {
        System.out.println("this is a song");

    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
