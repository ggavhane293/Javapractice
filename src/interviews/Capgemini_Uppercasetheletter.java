package interviews;

public class Capgemini_Uppercasetheletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "ganesh gavhane test";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 || s.charAt(i-1 ) == ' ') {
                result += Character.toUpperCase(c);  // Capitalize first letter of each word
            } else {
                result += c;  // Add other characters as is
            }
        }

        System.out.println(result);
    }
}

