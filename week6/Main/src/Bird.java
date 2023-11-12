public class Bird {
    private String name;
    private String latinName;
    private int observedCount = 0;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public void observed(){
        this.observedCount++;
    }
    public String getInfo(){
        return (this.name + ", " + this.latinName + " - Observed: " + this.observedCount);
    }
}
