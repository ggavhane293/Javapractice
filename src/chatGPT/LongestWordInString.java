package chatGPT;

public class LongestWordInString {
	
	public static String m1(String str)
	{
		String words[]=str.split(" ");
		String longest="";
		for(String word:words)
		{
			if(word.length()>longest.length())
			{
				longest=word;
			}
		}
		System.out.println(longest);
		return str;
	}

public static void main(String[] args) {
	String str="my name is ganesh gavhane";
	m1(str);
}

}
