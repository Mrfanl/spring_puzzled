package beans;

public class Singer {
    private String name;
    private Song song;

    public Singer(){
        System.out.println("I'm a singer");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void play(){
        System.out.println("My name is:"+this.name);
        System.out.println("My song is:"+this.song.getContext());
    }

}
