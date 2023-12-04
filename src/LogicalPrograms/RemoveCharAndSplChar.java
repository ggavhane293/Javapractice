package LogicalPrograms;

public class RemoveCharAndSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st = "aba^&6767GHH%dfd%$%4565ddf56";
		
		String chara="", num= "",splchar="";
		for(char ch:st.toCharArray())
		{
			if(ch>='0' && ch<= '9')
				{
				
				num=num+ch;
				}
			else if((ch>='a'&&ch<='z')||(ch>='A'&& ch<='Z'))
			{
				chara+=ch;
			}
			else
			{
				splchar+=ch;
			}

		}
		System.out.println("numerix:" +num);
		System.out.println("character:"+ chara);
		System.out.println("spl Character:"+splchar);
	}

}
