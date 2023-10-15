package Practice18.Task123;

import java.io.Serializable;

public class ParametersClass<T extends String & Comparable<String>, V extends Animal & Serializable, K> {
    T t;
    V v;
    K k;
    ParametersClass(T t,V v,K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return t.getClass() + " " + v.getClass() + " " + k.getClass();
    }
}
