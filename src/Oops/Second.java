package Oops;

	public class Second extends Methodoverriding{
		
		public void test() {
			
			System.out.println("parrent class method");
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Second m = new Second();
			Methodoverriding r =new Methodoverriding();
			
			m.test();
			r.test();
			
		}

	}

