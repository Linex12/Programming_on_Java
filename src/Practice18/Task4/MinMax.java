package Practice18.Task4;

public class MinMax<N extends Number> {
    N[] ns;
    public MinMax(N[] ns) {
        this.ns = ns;
    }
    public N min() {
        N min = ns[0];
        for (int i = 1; i < ns.length; i++) {
            if (ns[i].getClass() == Integer.class) {
                if (ns[i].intValue() < min.intValue()) {
                    min = ns[i];
                }
            }
            if (ns[i].getClass() == Double.class) {
                if (ns[i].doubleValue() < min.doubleValue()) {
                    min = ns[i];
                }
            }
        }
        return min;
    }
    public N max() {
        N max = ns[0];
        for (int i = 1; i < ns.length; i++) {
            if (ns[i].getClass() == Integer.class) {
                if (ns[i].intValue() > max.intValue()) {
                    max = ns[i];
                }
            }
            if (ns[i].getClass() == Double.class) {
                if (ns[i].doubleValue() > max.doubleValue()) {
                    max = ns[i];
                }
            }
        }
        return max;
    }
}
