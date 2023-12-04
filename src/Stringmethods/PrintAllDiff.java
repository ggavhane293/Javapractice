package Stringmethods;

public class PrintAllDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Aab2#bvn485%7&";
		
		
//		String b= a.replaceAll("[^0-9]", "");
//		String c= a.replaceAll("[^a-z]", "");		
//		System.out.println(b+"\n"+c);
		String b =a.replaceAll(" ", "");
		
		String chars = "", nums = "", specialChars = "";
		 for (char ch : a.toCharArray())
		 {
		        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'b'))
		        {
//		        	System.out.println("chars: " + ch + " ");
//		        	chars = chars + ch;
		        	chars += ch;
		        }
		        else if(ch >= 0 && ch <=9)
		        {
//		        	System.out.println("nums: " + ch + " ");
		        	nums += ch;
		        }
		        else {
//		        	System.out.println("speical chars: " + ch + " ");
		        	specialChars += ch;
		        }    	
		}
		 System.out.println(nums);
		 System.out.println(chars);
		 System.out.println(specialChars);
	}

}
