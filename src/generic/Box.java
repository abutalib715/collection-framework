package generic;

import java.util.List;

public class Box<T> {
    T container;

    public Box(T container) {
        this.container = container;
    }

    public void performSomeTask() {
        if (container instanceof String) {
            System.out.println("Length of string is " + ((String) container).length());
        } else if (container instanceof Integer) {
            System.out.println("Value of integer is " + container);
        } else if (container instanceof Boolean) {
            System.out.println("Boolean type value is " + container);
        } else if (container instanceof List<?>) {
            System.out.println("Size of list is " + ((List<?>) container).size());
        }
    }

    public T getValue() {
        return this.container;
    }
}
