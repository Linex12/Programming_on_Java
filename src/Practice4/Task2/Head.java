package Practice4.Task2;

public class Head {
    private String state;
    public Head() {
        state = "OK";
    }
    public Head(String state) {
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
