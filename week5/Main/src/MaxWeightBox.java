import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box1 {
    private double maxWeight;
    private List<Thing> things = new ArrayList<>();

    public MaxWeightBox(double mw){
        this.maxWeight = mw;
    }

    public void add(Thing thing){
        if (thing.getWeight() < this.maxWeight){
            this.things.add(thing);
        }
    }

    public boolean isInTheBox(Thing x){
        for(Thing thing : things){
            if (thing.getName().equals(x.getName())){
                return true;
            }
        }
        return false;
    }
}
