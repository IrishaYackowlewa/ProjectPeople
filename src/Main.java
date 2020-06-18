import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        CountMapIml<Integer> map = new CountMapIml<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int count = map.getCount(5); // 2
        int count2 = map.getCount(6); // 1
        int count3 = map.getCount(10); // 3*/

        System.out.println(count + " " + count2 + " " + count3);
        
        /*Person Lera = new Person(false, "Lera");
        Person Gleb = new Person(true, "Gleb");
        Person Any = new Person(false, "Any");
        Person Tom = new Person(true, "Tom");

        Lera.marry(Gleb);
        Any.marry(Tom);
        print(Lera);
        print(Gleb);
        print(Any);
        print(Tom);
        out.println();

        Tom.marry(Lera);
        print(Lera);
        print(Gleb);
        print(Any);
        print(Tom);
        out.println();

        Tom.marry(Gleb);
        Lera.marry(Any);
        print(Lera);
        print(Gleb);
        print(Any);
        print(Tom);
        out.println();

        Gleb.marry(Any);
        print(Lera);
        print(Gleb);
        print(Any);
        print(Tom);
        out.println();
         */
    }

    public static void print(Person person){
        if (person.haveSpouse ()) out.println(person.getNameSpouse());
        else out.println("single");
    }
}
