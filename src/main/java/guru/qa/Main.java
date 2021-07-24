package guru.qa;

public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat("Vasya", "ginger", true, 4, 2, 1);
        Cat barsik = new Cat("Barsik", "white", false, 3, 7, 1);


        System.out.println(vasya.getInfo());
        System.out.println(vasya.getLimbsQuantity());
        System.out.println(barsik.getInfo());
        System.out.println(barsik.getLimbsQuantity());
    }
}