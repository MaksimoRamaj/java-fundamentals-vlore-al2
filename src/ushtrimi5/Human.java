package ushtrimi5;

public class Human {
    static int popullsia;
    String emri;

    public Human(String emriIDhene){
        popullsia++;
        emri = emriIDhene;
    }

    public static void main(String[] args) {
        int popullsia1 = Human.popullsia;

        Human person1 = new Human("Personi1");
        Human person2 = new Human("Personi1");
        Human person3 = new Human("Personi1");

        System.out.println(Human.popullsia);
        String emri1 = person1.emri;
    }
}
