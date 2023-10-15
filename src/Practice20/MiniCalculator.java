package Practice20;

public class MiniCalculator {
    public static <N extends Number> N sum(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() + b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() + b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() + b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() + b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <N extends Number> N multiply(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() * b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() * b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() * b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() * b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <N extends Number> N divide(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() / b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() / b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)((a.intValue() * 1.0 / b.intValue() * 1.0));
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() / b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <N extends Number> N subtraction(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() - b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() - b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() - b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.doubleValue() - b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
}
