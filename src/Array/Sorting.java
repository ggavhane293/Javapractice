package Array;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Height[] = {1, 1, 3, 2, 4, 1};
//		int Height1[] = Height.clone(); // copy by value
		int Height1[] = new int[Height.length];
		for(int i=0;i<Height.length;i++) {
			Height1[i] = Height[i];
		}
		//int Height1[] = Height; // copy by reference
		for(int i=0;i<Height.length;i++)
		{
			for(int j=0;j<Height.length;j++)
			{
				int temp=0;
				if(Height[i]<Height[j])
				{
					temp=Height[i];
					Height[i]=Height[j];
					Height[j]=temp;
				}
			}
			
		}
			System.out.println();  
        for (int i = 0; i < Height.length; i++) {     
        	System.out.print(Height[i] + " "); 
	    }
        System.out.print("\n");
        int c = 0;
        for(int i=0; i<Height.length; i++) {
        	if(Height[i] != Height1[i]) {
        		System.out.print(Height1[i] + " ");
        		c++;
        	}
        }
        System.out.print("\nc: " + c);

}

}
