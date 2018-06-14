package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[10];
        int emptyTab[] = new int[0];
        double doubleTab[] = { 23.23, 214.232, 11.34 };
        int twoDimensionTab[][] = new int[10][10];
        String tabString[] = new String[10];

        double maxValueTab[] = {23.12 , 11.23, 55.21, 55.211, 43.102};
        double maxVal = 0;
        for (int i = 1; i < maxValueTab.length; i++) {
            if(maxValueTab[i-1]<maxValueTab[i]) maxVal = maxValueTab[i];
        }
        System.out.println(maxVal);

        Country co1 = new Country();
        co1.setCities(new City("Gdansk",1200000,"Pomorskie","Polska"));
        co1.setCities(new City("Warszawa",1312311,"Mazowieckie","Polska"));
        co1.setCities(new City("Szczecin",33330212,"ZachodnioPomorskie","Polska"));
        co1.setCities(new City("Los Angeles",9999999,"??","USA"));

        System.out.println(co1.toString());

        //task3
        List<Integer> listOfTables = new ArrayList<>();
        listOfTables.add(23);
        listOfTables.add(11);
        listOfTables.add(14);
        int a = listOfTables.size()/2;
        System.out.println(a);
        System.out.println(listOfTables.get(a)+"\n");
        listOfTables.remove(a);
        for (Integer i : listOfTables) {
            System.out.println(i+" ");
        }
        Random random = new Random();
        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add(random.nextInt(10));
        }
    }
}
