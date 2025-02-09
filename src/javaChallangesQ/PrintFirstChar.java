package javaChallangesQ;

public class PrintFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="virat kohali is great plyer";
		String a[]=str.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			String s=a[i];
			System.out.println(s.charAt(0));
	}
	}

}
