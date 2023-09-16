package LogicalPrograms;

public class ReverseWithStingBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2345;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();
		
		System.out.println(rev);

	}

}
