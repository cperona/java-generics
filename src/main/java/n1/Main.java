package n1;

public class Main {
    public static void main() {
        System.out.println("\nNon generic: ");
        NoGenericMethods noGenericMethods = new NoGenericMethods("asosos", "asisi", "asuu");
        System.out.println(noGenericMethods.getElement1() + " " + noGenericMethods.getElement2() + ", " + noGenericMethods.getElement3());

        System.out.println("\nGeneric: ");
        GenericMethods genericMethods = new GenericMethods(new Person("ying", "yang", 99), "This is a string", 12);
        genericMethods.printElements();
    }
}