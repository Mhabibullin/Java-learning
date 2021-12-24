package guru.qa;

import java.util.ArrayList;
import java.util.List;


public class Product {
    final List<String> strings = new ArrayList<String>();

    void init() {
        strings.add("Hello world");
        strings.add("My dads");
        System.out.println(strings);
    }

    public static void main(String[] args) {

    }

/*        List<String> result = strings.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

    public static void replace(List<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        while (iterator.hasNext())
        {
            iterator.set(iterator.next().toLowerCase());
        }
    }*/
}
