package Practice22.Task2;

public class Test {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair functionalChair = factory.createFunctionalChair();
        Chair magicChair = factory.createMagicianChair();
        Chair victorianChair = factory.createVictorianChair();
        ((MagicChair)magicChair).doMagic();
        System.out.println(((FunctionalChair)functionalChair).sum(8,7));
        System.out.println(((VictorianChair)victorianChair).getAge());
        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}
