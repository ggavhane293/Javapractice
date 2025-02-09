package chatGPT;

import java.util.LinkedHashMap;

public class FirstNonRepeated {

    public static void main(String[] args) {
        String str = "programmingp";
        m1(str);
    }

    public static String m1(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println("Character Frequencies: " + map);
        
        // Find the first non-repeated character
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeated Character: " + ch);
                break; // Exit loop after finding the first non-repeated character
            }
        }
        
        return str;
    }
}
