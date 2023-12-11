package javaChallangesQ;

public class TypeCasting {
	//covert the string to integer

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String z ="10";
		String y="20";
		
		try {
			int a=Integer.parseInt(z);
			int b=Integer.parseInt(y);
			System.out.println(a+b);
		}
		catch(NumberFormatException d)
		{
			System.out.println("cannot add string");
		}

	}

}
