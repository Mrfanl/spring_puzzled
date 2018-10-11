package beans;

public class Song {
    private String context;
    public Song(){
        System.out.println("this is a song");
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
