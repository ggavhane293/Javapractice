package interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReydanIntactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        String[] str = {"ganesh", "is", "very", "good", "tester", "is", "tester"};
		        ArrayList<String> dArr = new ArrayList<String>();
		        Set<String> hash_Set = new HashSet<String>();
		        for(int i=0; i<str.length; i++) {
		            int count = 0;
		            for(int j=0; j<str.length; j++) {
		                if(str[i].equals(str[j])) {
		                    if(count > 0) {
		                        // System.out.println("str[i]: "+ str[i] + "\n");
		                        dArr.add(str[i]);
		                        hash_Set.add(str[i]);
		                        break;
		                    }
		                    count++;
		                }
		            }    
		        }
		        String maxLenStr = "";
		        int maxLength = 0;
		        for(String i: hash_Set) {
		            if(i.length() >= maxLength) {
		                maxLength = i.length();
		                maxLenStr = i;
		            }
		        }
		        System.out.println("maxLength: "+ maxLength);
		        System.out.println("maxLenStr: "+ maxLenStr);
		    }
		
		
	}


