import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box1 {
    private List<Thing> things = new ArrayList<>();

    public void add(Thing thing){
        if (this.things.size() == 0){
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
