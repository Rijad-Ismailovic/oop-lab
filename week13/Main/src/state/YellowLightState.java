package state;

public class YellowLightState implements TrafficLightState{
    public void transitionToRed() {
        System.out.println("Switching to Red state");
    }

    public void transitionToGreen() {
        System.out.println("Switching to Green state");
    }

    public void transitionToYellow() {
        System.out.println("Already in Yellow state");
    }
}
