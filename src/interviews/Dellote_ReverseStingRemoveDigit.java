package interviews;

public class Dellote_ReverseStingRemoveDigit {

	    public void test(String a)
	    {
	      String rev="";
	      String b =a.replaceAll("[0-9]", "");
	      char str []= b.toCharArray();
	      
	      for(int i=str.length-1;i>=0;i--)
	      {
	        rev+=str[i];
	      }
	      System.out.println(rev);
	    }
	    public static void main(String[] args) {
	      System.out.println("program of reverse String");
	      Dellote_ReverseStingRemoveDigit m = new Dellote_ReverseStingRemoveDigit();
	      m.test("my test36474 88gh");
	  }
	}


