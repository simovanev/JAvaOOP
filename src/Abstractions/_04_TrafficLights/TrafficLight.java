package Abstractions._04_TrafficLights;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    enum Light {
        RED,
        GREEN,
        YELLOW;

    }

    public void update() {
        switch (this.light) {
            case RED:
                this.light = Light.GREEN;
                break;
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
        }
    }

    public Light getLight() {
        return light;
    }
}
