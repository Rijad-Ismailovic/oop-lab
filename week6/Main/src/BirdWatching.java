import java.util.ArrayList;

public class BirdWatching {
    private ArrayList<Bird> list = new ArrayList<>();

    public void add(Bird bird){
        list.add(bird);
    }
    public void observation(Bird bird){
        bird.observed();
    }
    public void statistics(){
        for(Bird bird : list){
            System.out.println(bird.getInfo());
        }
    }
    public void show(Bird bird){
        System.out.println(bird.getInfo());
    }
}
