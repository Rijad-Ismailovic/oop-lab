package state;

public interface TrafficLightState {
    public void transitionToRed();
    public void transitionToYellow();
    public void transitionToGreen();
}
