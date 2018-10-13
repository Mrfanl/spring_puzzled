package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Set;

public class Singer {

    private String name;

//    @Autowired
    @Resource
    @Qualifier("main")
    private Set<Song> songs;

    public Singer(){}

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void populateMovieCache() {
        System.out.println("populates the movie cache upon initialization...");
    }

    @PreDestroy
    public void clearMovieCache() {
        // clears the movie cache upon destruction...
        System.out.println("clears the movie cache upon destruction...");

    }


    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public void play(){
        System.out.println("myName is :"+this.name);
        Iterator<Song> iter = this.songs.iterator();
        while(iter.hasNext()){
            System.out.println("one of my Song is:"+iter.next().getContext());
        }
    }
}
