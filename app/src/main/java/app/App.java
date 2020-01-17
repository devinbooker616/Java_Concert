package app;

import java.util.Map;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<String, Double>();
        m.put("Big Theif", 5.00);
        m.put("Gojira", 20.00);
        m.put("Secret Band", 15.00);
        m.put("Of Mice and Men", 25.00);
        System.out.println("What band? Would you like to see?");

        for (Map.Entry<String, Double> entry : m.entrySet()) {

            System.out.println(entry.getKey());
        }
    }
}
