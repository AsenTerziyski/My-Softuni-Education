package Pr04TrafficLights;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(TrafficLightState initialState) {
        this.state = initialState;
    }

    public void update() {
        // update state
        switch (this.state) {
            case RED:
                this.state = TrafficLightState.GREEN;
                break;
            case GREEN:
                this.state = TrafficLightState.YELLOW;
                break;
            case YELLOW:
                this.state = TrafficLightState.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
