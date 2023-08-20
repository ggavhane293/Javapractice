package LogicalPrograms;

public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="ganesh";
		//substring
		System.out.println(str.substring(2));
		
		//split
		System.out.println(str.split("gan"));
		
		//method one
		System.out.println(str.replace("gan", "res"));
		//method two
		
		StringBuffer st = new StringBuffer(str);
		System.out.println(st.replace(0, 2, "re"));

	}

}
