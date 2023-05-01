package Oops;

public class Methodoverloading {
	
	
	public void test() {//first default method
		System.out.println("default method" + " ");
	}
	public void test(int a) {//second method with different argument
		System.out.println("method overloaded first..."+a);
	}
	public void test(String s) {//third method with same name but different argument
		System.out.println("method overloaded second..."+s);
	}
	public static void main(String[]args) {
		Methodoverloading m = new Methodoverloading();//object creation
		m.test(1);// calling first method
		m.test(2);//calling second method
		m.test("my test");//calling third method
	}

}
