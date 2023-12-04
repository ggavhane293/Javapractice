package interviews;

public class Coforge {

	public static void main(String[] args) {
		// reverse all strings
		
		String s = "i.like.this.program.very.much";
        String st []= s.split("\\.");
        int len = st.length;
        String rev ="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+st[i];
            System.out.println(rev);
            
            if(i!=0)
            {
           	 rev+=".";
            }
            
        }
        
    }
	}

