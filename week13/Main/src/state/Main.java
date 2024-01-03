package state;

public class Main {
    public static void main(String[] args){
        TrafficLightContext context = new TrafficLightContext();
        context.transitionToRed();
        context.transitionToYellow();
        context.transitionToGreen();
        context.transitionToGreen();
    }
}
