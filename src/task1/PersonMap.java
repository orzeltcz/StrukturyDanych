package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("set.txt"));
            Map<String, Set<Person>> map = new HashMap<>();
            for (String line : lines) {
                Person person = Person.fromString(line);
                if (!map.containsKey(person.getSurname())) {
                    map.put(person.getSurname(), new HashSet<>());
                }
                map.get(person.getSurname()).add(person);
            }

            System.out.println(map);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}