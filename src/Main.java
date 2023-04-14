public class Main {
    public static void main(String[] args) {
        Person person = new Person("Elvana", "beautiful");
        Programmer programmer= new Programmer("Alina", "Smart","Peaksaft");
        Dancer dancer= new Dancer("Nagima" , "Butterflay","BlackPink");
        Singer singer = new Singer("Akbermet", "Better","Hanbike");


        System.out.println(person);
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);

        person.walk();
        person.learn();
        person.eat();
        programmer.coding();
        dancer.dansing();

    }
}