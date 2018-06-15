package task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CountChars {
    public static void main(String[] args) {
        int i=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("a.properties"));

            while (br.read()!=-1){
                i++;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
