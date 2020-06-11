
public class Main {

    public static void main(String[] args) {
        Person Lera = new Person(false, "Lera");
        Person Gleb = new Person(true, "Gleb");
        Person Any = new Person(false, "Any");
        Person Tom = new Person(true, "Tom");
        Lera.marry(Gleb);
        Any.marry(Tom);
    }
}
