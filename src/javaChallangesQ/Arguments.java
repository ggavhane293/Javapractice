package javaChallangesQ;

public class Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(args.length);
		  if(args.length<2){
		   System.out.println("Insufficent Inputs.");
		  }
		  else{
		   Integer a = Integer.parseInt(args[0]);
		   Integer b = Integer.parseInt(args[1]);
		   System.out.println("Answer "+(a+b));
		  }
		 

	}

}
