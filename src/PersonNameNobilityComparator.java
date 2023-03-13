import java.util.Comparator;

public class PersonNameNobilityComparator implements Comparator<Person> {
    public int maxLetters;

    public PersonNameNobilityComparator(int maxLetters) {
        this.maxLetters = maxLetters;
    }
    //Добавьте в ваш компаратор конструктор,
// в котором указывается максимальное количество слов в фамилии,
    //Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:
    //У кого больше слов в фамилии, тот более знатен

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() == o2.getSurname().length()) {
            return Integer.compare(o2.getAge(), o1.getAge());
            //Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
        }
        if ((o1.getSurname().length() >= maxLetters) && (o2.getSurname().length() >= maxLetters)) {
            // если обе фамилии состоят из количества слов не меньше чем число,
            // указанное в конструкторе, то обе фамилии равнозначны и по ним нельзя определить знатность
            // (что нужно продолжать сравнение уже по возрасту)
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(o2.getSurname().length(), o1.getSurname().length());
        }


    }
}
