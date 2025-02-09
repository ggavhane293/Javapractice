package java8_feature;

//@FunctionalInterface

interface Square {
	int calculate(int x);
}

class FunctionalInterface {
	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;	

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
		Square s1= (int x)-> x+x;
		
		int ans1=s1.calculate(a);
		System.out.println(ans1);
	}
}
