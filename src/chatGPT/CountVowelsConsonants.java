package chatGPT;

public class CountVowelsConsonants {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "programming";
		m1(str);

	}
	
	public static String m1(String str)
	{
		int vowels=0, consnants=0;
		for(char ch:str.toCharArray())
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else 	
				consnants++;
		}
		System.out.println("vowels : "+vowels);
		System.out.println("consonants :"+consnants);
		return str;
	}



}
