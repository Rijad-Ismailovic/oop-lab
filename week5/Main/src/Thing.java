public class Thing {
    private double weight;
    private String name;

    public Thing(String n, double w){
        if(w < 0){
            throw new IllegalArgumentException("Weight cannot be negative.");
        } else{
            this.weight = w;
            this.name = n;
        }
    }

    public double getWeight(){
        return this.weight;
    } 
    public void setWeight(double x){
        this.weight = x;
    }
    public String getName(){
        return this.name;
    }
}
