package n1;

public class GenericMethods<T> {
    private T element1;
    private T element2;
    private T element3;

    public GenericMethods(T element1, T element2, T element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T getElement1() {
        return element1;
    }

    public T getElement2() {
        return element2;
    }

    public T getElement3() {
        return element3;
    }

    public void printElements() {
        System.out.println(element1 + " " + element2 + " " + element3);
    }
}
