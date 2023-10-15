package Practice1.Task1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Mike");
        dog.setAge(9);
        System.out.println(dog);
        dog.intoHumanAge();
    }
}
