package Practice4.Task2;

public class Body {
    private String state;
    public Body() {
        state = "OK";
    }
    public Body(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String toString() {
        return " State: "+state;
    }
}
