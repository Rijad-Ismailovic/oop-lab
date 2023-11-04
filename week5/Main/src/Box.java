public class Box implements ToBeStored{
    private double maxWeight;
    private double weight = 0;
    private int counter = 0;

    public Box(int mw){
        this.maxWeight = mw;
    }

    public double weight(){
        return this.weight;
    }

    public void add(ToBeStored thing){
        if (thing.weight() + this.weight <= this.maxWeight){
            this.weight += thing.weight();
            counter ++;
        }
    }

    public String toString(){
        return "Box: " + this.counter + " things, total weight: " + this.weight;
    }
}
