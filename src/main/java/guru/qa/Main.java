package guru.qa;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Cat murzik = new Cat("Murzik", "ginger", true, 4, 2, 1);
          Cat rizhik = new Cat("Rizhik", "white", false, 3, 7, 1);


          System.out.println(murzik.getInfo());
          System.out.println(murzik.getLimbsQuantity());
          System.out.println(rizhik.getInfo());
          System.out.println(rizhik.getLimbsQuantity());

          String cold = "cold";
          String warm = "warm";
          Scanner myscan = new Scanner(System.in);
          int temperature = myscan.nextInt();
          if (temperature >= 0)
               System.out.println(warm);
          else
               System.out.println(cold);
          myscan.close();


     }
}