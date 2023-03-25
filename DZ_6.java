
import java.util.*;

public class DZ_6 {

    String name;
    String surname;
    int age;
    String sex;
    int id;
    String phoneNumbers;
    String profession;

    public DZ_6(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] args) {

        DZ_6 p1 = new DZ_6("Anna", "Denisova", 111);
        p1.age = 88;
        p1.sex = "female";
        p1.profession = "vet";
        p1.phoneNumbers = "15632, 85987";

        DZ_6 p2 = new DZ_6("Marina", "Pavlova", 159);
        p2.age = 11;
        p2.sex = "female";
        p2.profession = "blogger";
        p2.phoneNumbers = "33333, 11588";

        DZ_6 p3 = new DZ_6("Peter", "Vaskin", 335);
        p3.age = 15;
        p3.sex = "male";
        p3.profession = "singer";
        p3.phoneNumbers = "12555, 32666";

        DZ_6 p4 = new DZ_6("Vanya", "Petrov", 771);
        p4.age = 26;
        p4.sex = "male";
        p4.profession = "photographer";
        p4.phoneNumbers = "56998";

        DZ_6 p5 = new DZ_6("Anna", "Denisova", 111);
        p5.age = 88;
        p5.sex = "female";
        p5.profession = "actress";
        p5.phoneNumbers = "44444";

        List<DZ_6> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(i + 1 + "." + " " + persons.get(i));
        }


        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.name + "'s hashcode is: " + p2.hashCode());
        System.out.println();
        doesWhat(p3);
        System.out.println();

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).age >= 20) {
                System.out.println(persons.get(i).name + " is 20 or older");
            } 
        }
    }

    public String toString() {
        return String.format("%s %s, %d", name, surname, age);
    }

    public boolean equals(DZ_6 p) {
        if (p == null) {
            return false;
        }
        if (!(p instanceof DZ_6)) {
            return false;
        }
        DZ_6 anotherPerson = (DZ_6) p;
        return name.equals(anotherPerson.name) && surname.equals(anotherPerson.surname) && id == anotherPerson.id;
    }

    public static void doesWhat(DZ_6 who) {
        switch (who.profession) {
            case ("vet"):
                System.out.println(who.name + " cures animals");
                break;
            case ("blogger"):
                System.out.println(who.name + " publishes posts");
                break;
            case ("singer"):
                System.out.println(who.name + " sings songs");
                break;
            case ("photographer"):
                System.out.println(who.name + " takes pictures");
                break;
            case ("actress"):
                System.out.println(who.name + " plays in movies");
                break;
            default:
                System.out.println(who.name + " does who knows what");
                break;
        }
    }
}