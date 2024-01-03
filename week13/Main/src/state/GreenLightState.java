package state;

public class GreenLightState implements TrafficLightState{
    public void transitionToRed() {
        System.out.println("Switching Red state");
    }

    public void transitionToGreen() {
        System.out.println("Already in Green state");
    }

    public void transitionToYellow() {
        System.out.println("Switching to Yellow state");
    }
}
