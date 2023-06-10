import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Basic Java", 3000);
        courses.put("Spring Boot", 8000);
        courses.put("Kotlin", 5000);

        System.out.println(courses);

        courses.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });
    }
}
