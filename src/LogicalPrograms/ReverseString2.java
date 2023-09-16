package LogicalPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str ="abcd";
		int num=1234;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		//StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(sb);

	}

}
