package chatGPT;

import java.util.*;

public class MaxOccuranceOfChar {
    public static void main(String[] args) {
        String str = "programmingg";
        char maxChar = ' ';
        int maxCount = 0;

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> hm = new HashMap<>();

        // Iterate through the string and populate the HashMap
        for (char ch : str.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // Find the character with the maximum frequency
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Print the result
        System.out.println("Character with maximum occurrences: " + maxChar);
        System.out.println("Occurrences: " + maxCount);
    }
}
