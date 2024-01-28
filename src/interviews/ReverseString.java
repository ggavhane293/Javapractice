package interviews;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello!java,hi.by+tc";
		String str1 []=str.split("[!.,+]");
		for(String st:str1)
		{
			System.out.println(st);
		}

	}

}
