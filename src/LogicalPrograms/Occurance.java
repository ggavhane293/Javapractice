package LogicalPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Occurance {
    
    public void m1(String str) {
    	
        System.out.println("You entered: " + str);
        
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(char ch:str.toCharArray())
        {
        	if(hm.containsKey(ch))
        	{
        		hm.put(ch, hm.get(ch)+1);
        	}
        	else
        	{
        		hm.put(ch, 1);
        	}
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        Occurance t = new Occurance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        //System.out.flush(); // Ensures prompt is displayed immediately
        String s = sc.nextLine();
        t.m1(s);
        sc.close();
    }
}
