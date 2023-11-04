public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private double weight;

    public CD(String a, String t, int y){
        this.artist = a;
        this.title = t;
        this.year = y;
        this.weight = 0.1;
    }

    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }

    public double weight(){
        return this.weight;
    }
}
