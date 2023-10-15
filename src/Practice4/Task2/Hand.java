package Practice4.Task2;

public class Hand {
    private String state;
    public Hand() {
        state = "OK";
    }
    public Hand(String state) {
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
