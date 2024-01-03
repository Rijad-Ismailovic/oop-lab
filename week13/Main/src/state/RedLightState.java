package state;

public class RedLightState implements TrafficLightState {
    
    public void transitionToRed() {
        System.out.println("Already in Red state");
    }

    public void transitionToGreen() {
        System.out.println("Switching to Green state");
    }

    public void transitionToYellow() {
        System.out.println("Switching to Yellow state");
    }

}
