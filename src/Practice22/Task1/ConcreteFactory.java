package Practice22.Task1;

public class ConcreteFactory implements AbstractComplexFactory {
    public Complex createComplex() {
        return new Complex();
    }
    public Complex createComplex(int real, int image) {
        return new Complex();
    }
}
