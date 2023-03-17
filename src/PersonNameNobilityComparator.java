import java.util.Comparator;

public class PersonNameNobilityComparator implements Comparator<Person> {
    public int maxWords;
    public String[] newSurname1;
    public String[] newSurname2;

    public PersonNameNobilityComparator(int maxWords) {
        this.maxWords = maxWords;
    }
    //Добавьте в ваш компаратор конструктор,
// в котором указывается максимальное количество слов в фамилии,
    //Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:
    //У кого больше слов в фамилии, тот более знатен

    @Override
    public int compare(Person o1, Person o2) {

        newSurname1 = o1.getSurname().split("[ -]");
        newSurname2 = o2.getSurname().split("[ -]");

        if (newSurname2.length == newSurname1.length) {
            return Integer.compare(o2.getAge(), o1.getAge());
            //Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
        }
        if ((newSurname2.length >= maxWords) && (newSurname1.length >= maxWords)) {
            // если обе фамилии состоят из количества слов не меньше чем число,
            // указанное в конструкторе, то обе фамилии равнозначны и по ним нельзя определить знатность
            // (что нужно продолжать сравнение уже по возрасту)
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        if ((newSurname1.length < maxWords) && (newSurname2.length < maxWords)) {
            return Integer.compare(newSurname2.length, newSurname1.length);
        }
        return Integer.compare(newSurname2.length, newSurname1.length);

    }
}
