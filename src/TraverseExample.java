import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Akash");
        names.add("Batash");
        names.add("Sagor");
        names.add("Nodi");
        names.add("Pahar");
        System.out.println(names);

        // TRAVERSING USING FOREACH LOOP
        for (String name : names) {
            System.out.print(name + "\t" + name.length() + "\t");

            StringBuffer sbf = new StringBuffer(name);
            System.out.println(sbf.reverse());
        }

        System.out.println("__________________________");

        // TRAVERSING USING ITERATOR
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("__________________________");

        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        System.out.println("__________________________");
        names.forEach(str -> {
            System.out.println(str);
        });


    }
}
