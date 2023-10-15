package Practice4.Task2;

public class Human {
    private Head head;
    private Body body;
    private Hand handleft;
    private Hand handright;
    private Leg legleft;
    private Leg legright;
    public Human() {
        head = new Head();
        body = new Body();
        handleft = new Hand();
        handright = new Hand();
        legleft = new Leg();
        legright = new Leg();
    }
    public Human(String state) {
        head = new Head(state);
        body = new Body(state);
        handleft = new Hand(state);
        handright = new Hand(state);
        legleft = new Leg(state);
        legright = new Leg(state);
    }
    @Override
    public String toString() {
        return "Head: "+head+"\nBody: "+body+"\nLeft hand: "+handleft+"\nRight hand: "+handright+
                "\nLeft leg: "+legleft+"\nRight leg: "+legright;
    }
}
