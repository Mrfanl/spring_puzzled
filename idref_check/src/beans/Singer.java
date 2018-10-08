package beans;

public class Singer implements Performer {

    private String name;
    private String song;

    public Singer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("my name is:"+this.name);
        System.out.println("my song is:"+this.song);

    }
}
