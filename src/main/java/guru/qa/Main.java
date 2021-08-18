package guru.qa;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", "ginger", true, 4, 2, 1);
        Cat rizhik = new Cat("Rizhik", "white", false, 3, 7, 1);


        System.out.println(murzik.getInfo());
        System.out.println(murzik.getLimbsQuantity());
        System.out.println(rizhik.getInfo());
        System.out.println(rizhik.getLimbsQuantity());
    }
}