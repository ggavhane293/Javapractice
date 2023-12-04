package LogicalPrograms;

public class SwapinOfTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="abc";
			
			String b="hfhf";
			
			a=a+b;
			
			b=a.substring(0,a.length()-b.length());
			
			a=a.substring(b.length());
			
			System.out.println("value of a is:"+a);
			System.out.println("value of a is:"+b);
			
			
	}

}
