package Practice4.Task2;

public class Leg {
    private String state;
    public Leg() {
        state = "OK";
    }
    public Leg(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return " State: "+state;
    }
}
