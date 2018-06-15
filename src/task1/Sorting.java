package task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting{
   static List<City>  cities = new LinkedList<>();



    public static void main(String[] args) throws Exception {
        List<String> str = new LinkedList<>();
            str.add("abc");
            str.add("bcd");
            str.add("ghi");
            str.add("cde");
            str.add("dwads");
            str.add("Awads");

        cities.add(new City("Gdansk", 1200000, "Pomorskie", "Polska"));
        cities.add(new City("Warszawa", 1312311, "Mazowieckie", "Polska"));
        cities.add(new City("Szczecin", 33330212, "ZachodnioPomorskie", "Polska"));
        cities.add(new City("Los Angeles", 9999999, "??", "USA"));
        Collections.sort(str);
        Collections.sort(cities);

        for (City ct: cities) {
            System.out.println(ct.getName());
        }

        for (String st :str) {
            System.out.println(st);
        }

    }

}
