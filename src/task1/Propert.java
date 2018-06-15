package task1;

import javafx.beans.property.Property;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class Propert {
    private static List<String> dataFromFiles;


    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            BufferedReader br = new BufferedReader(new FileReader("f.properties"));
            properties.load(br);
            Enumeration<?> enumeration = properties.propertyNames();
            FileWriter fw = new FileWriter("f.properties");
            while(enumeration.hasMoreElements()) {
                System.out.println(enumeration.nextElement().toString());
            }
            properties.setProperty("newkey", "" + "bbbbb");
            properties.store(fw, "new Property");
           fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
