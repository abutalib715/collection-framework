package generic;

public class Test {
    public static void main(String[] args) {

        // STRING TYPE
        Box<String> box = new Box("New World");
        box.container = "Custom World";
        System.out.println(box.getValue());
        System.out.println(box.getValue().getClass().getName());
        box.performSomeTask();

        // INTEGER TYPE
        Box<Integer> box2 = new Box(353);
        box2.container = 8989890;
        System.out.println(box2.getValue());
        System.out.println(box2.container.getClass().getName());
        box2.performSomeTask();

        // BOOLEAN TYPE
        Box<Boolean> box3 = new Box<>(true);
        System.out.println(box3.getValue());
        System.out.println(box3.container.getClass().getName());
        box3.performSomeTask();

    }
}
