package guru.qa;

public class Cat {

    static String ShowAnimalClass = "Animals";

    String name;
    String color;
    boolean haveMustache;
    int pawsQuantity;
    int age;
    int tail;

    public Cat(String name, String color, boolean haveMustache, int pawsQuantity, int age, int tail) {
        this.name = name;
        this.color = color;
        this.haveMustache = haveMustache;
        this.pawsQuantity = pawsQuantity;
        this.age = age;
        this.tail = tail;
    }

    public String getInfo() {
        return "Cat name:" + this.name + " " + "Cat color:" + this.color + " " + "Cat have moustache:"
                + this.haveMustache + " " + "Cat paws quantity:" + this.pawsQuantity + " " + "Cat age:" + this.age
                + " " + "Cat have tail:" + this.tail;
    }

    public String getLimbsQuantity() {
        return "Cat limbs quantity:" + tail + pawsQuantity;
    }

}
