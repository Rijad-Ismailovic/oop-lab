package state;

public class TrafficLightContext {
    private TrafficLightState state;
    
    public TrafficLightContext(){
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed(){
        this.state.transitionToRed();
        this.setState(new RedLightState());
    }

    public void transitionToYellow(){
        this.state.transitionToYellow();
        this.setState(new YellowLightState());
    }

    public void transitionToGreen(){
        this.state.transitionToGreen();
        this.setState(new GreenLightState());
    }
    
}
