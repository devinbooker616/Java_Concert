package app;

import java.util.Map;

import java.util.HashMap;

import java.util.Scanner;

public class App {

    static void displayBands() {
        final Map<String, Double> m = new HashMap<String, Double>();
        m.put("Big Thief", 5.00);
        m.put("Gojira", 20.00);
        m.put("Secret Band", 15.00);
        m.put("Of Mice and Men", 25.00);
        for (final Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    static String getBand() {
        final Scanner sc = new Scanner(System.in);
        System.out.println("What band? Would you like to see?");
        final Map<String, Double> m = new HashMap<String, Double>();
        m.put("Big Thief", 5.00);
        m.put("Gojira", 20.00);
        m.put("Secret Band", 15.00);
        m.put("Of Mice and Men", 25.00);
        displayBands();
        while (true) {
            final String input = sc.nextLine();
            for (final Map.Entry<String, Double> entry : m.entrySet()) {
                if (entry.getKey().equals(input)) {
                    System.out.println("That will be " + entry.getValue());
                    return input;
                } else {
                    continue;
                }
            }
        }
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final Map<String, Double> m = new HashMap<String, Double>();
        m.put("Big Thief", 5.00);
        m.put("Gojira", 20.00);
        m.put("Secret Band", 15.00);
        m.put("Of Mice and Men", 25.00);
        final String band = getBand();
    }
}
