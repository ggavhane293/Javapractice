package interviews;

public class Capgemini_ReverseOnSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String s = "ganesh gavhane trb";
	        String ar[] = s.split(" ");
	        String rev = "";

	        for (int i = 0; i < ar.length; i++) {
	            String var = ar[i];
	            String ans = "";
	            for (int j = var.length() - 1; j >= 0; j--) {
	                ans = ans + var.charAt(j);
	            }
	            rev = rev + ans + " ";
	        }
	        System.out.println(rev.trim());  // trim() to remove the trailing space
	    }

	}


