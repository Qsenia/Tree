import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", "Хольнова", 4));
        people.add(new Person("Лидия", "Хольнова", 7));
        people.add(new Person("Оксана", "Глушенкова", 10));
        people.add(new Person("Ольга", "Глушенкова", 15));
        people.add(new Person("Федор", "Кац", 3));
        people.add(new Person("Максим", "Ким", 2));

        System.out.println(people);
        Collections.sort(people, new PersonNameNobilityComparator(9));
        System.out.println(people);

    }
}