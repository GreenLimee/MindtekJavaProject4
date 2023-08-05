package src.collectionsIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapTask4 {
    public static void main(String[] args) {

        ArrayList<Person> people = createPeople();
        Map<String, ArrayList<Person>> map = new HashMap<>();
        // people under 20th, between 20-30, over 30

        map.put("Under 20", new ArrayList<Person>());
        map.put("Between 20-30", new ArrayList<Person>());
        map.put("Over 20", new ArrayList<Person>());

        groupPeopleByAge(map, people);
        System.out.println(map);

    }

    private static void groupPeopleByAge(Map<String, ArrayList<Person>> map, ArrayList<Person> people) {

    }

    private static ArrayList<Person> createPeople() {

        Person p1 = new Person("Jack", "Peterson", 23);
        Person p2 = new Person("Jess", "Smith", 35);
        Person p3 = new Person("Ross", "Peter", 27);
        Person p4 = new Person("Joe", "Son", 67);
        Person p5 = new Person("Chandler", "Gray", 12);
        Person p6 = new Person("Rachel", "Swift", 45);
        Person p7 = new Person("Scott", "Merkel", 18);
        Person p8 = new Person("Brad", "Peterson", 33);

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
        return people;




    }
}
