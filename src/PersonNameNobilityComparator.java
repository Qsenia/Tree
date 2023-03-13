import java.util.Comparator;

public class PersonNameNobilityComparator implements Comparator<Person> {
    public int maxLetters=9;

    public PersonNameNobilityComparator() {
    }

    //Добавьте в ваш компаратор конструктор,
// в котором указывается максимальное количество слов в фамилии,
// которое имеет смысл при сравнении.
    public PersonNameNobilityComparator(int maxLetters) {
        this.maxLetters = maxLetters;
    }

    //Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:
    //У кого больше слов в фамилии, тот более знатен
    //Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() == o2.getSurname().length()) {
        } else if ((o1.getSurname().length()>=maxLetters)||(o2.getSurname().length()>=maxLetters)){
            // если обе фамилии состоят из количества слов не меньше чем число,
            // указанное в конструкторе, то обе фамилии равнозначны и по ним нельзя определить знатность
            // (что нужно продолжать сравнение уже по возрасту)
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
