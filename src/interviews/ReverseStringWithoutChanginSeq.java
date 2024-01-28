package interviews;

public class ReverseStringWithoutChanginSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "i.like.this.program.very.much";
         String st []= s.split("[.]");
         int len = st.length;
         String rev ="";
         for(int i=len-1;i>=0;i--)
         {
             rev=rev+st[i];
             if(i!=0)
             {
            	 rev+=".";
             }
             
         }
         System.out.println(rev);
         
	}

}
