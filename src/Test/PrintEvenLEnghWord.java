package Test;

public class PrintEvenLEnghWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello java World";
		
		for(String s :str.split(" ")) {
			if(s.length()%2==0)
			{
				System.out.println(s);
			}
		}
	}

}
