package Test;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java world";
		String splitarray[]= str.split(" ");
		for(int i=splitarray.length-1;i>=0;i--)
		{
			System.out.print(splitarray[i]+" ");
		}
	}

}
