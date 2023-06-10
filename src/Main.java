import java.util.*;

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

        Stack<String> stack = new Stack<>();
        stack.addAll(vector);
        System.out.println(stack);

        System.out.println("_________________________________");

        HashSet<Double> numbers = new HashSet<>();

        numbers.add(14.55);  //AUTO BOXING
        numbers.add(45.545);
        numbers.add(12.2);
        numbers.add(14.55);
        numbers.add(5.3);

        System.out.println(numbers);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(numbers);
        System.out.println(tset);
    }
}