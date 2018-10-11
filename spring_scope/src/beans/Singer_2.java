package beans;

import aware.CommandManager;

public class Singer_2{
    private String name;
    private Song song;
    private CommandManager manager;

    public Singer_2(){
        System.out.println("I'm a singer");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong() {
        this.song = manager.createSong();
    }

    public void setManager(CommandManager manager) {
        this.manager = manager;
    }

    public void play(){
        System.out.println("My name is:"+this.name);
        System.out.println("My song is:"+this.song.getContext());
    }

}
