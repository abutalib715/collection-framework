import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nabul");
        System.out.println(list);

        List newList = new ArrayList();
        newList.add("Nafsu");
        newList.add(133);
        newList.add(true);
        System.out.println(newList);
    }
}
