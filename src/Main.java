import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        ArrayList rand = new ArrayList();

        rand.add(true);
        rand.add("Ta;o");
        rand.add(444);

        LinkedList<String> names = new LinkedList();

        names.add("Akash");
        names.add("Batash");
        names.add(String.valueOf(656));
        System.out.println(names);

        System.out.println(rand.size());
        System.out.println(names.contains("Akash"));
        System.out.println(names.isEmpty());

        names.set(0, "Nodi");
        System.out.println(names);

        names.add(0, "Pahar");
        System.out.println(names);

//        names.clear();
//        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println(vector);
    }
}