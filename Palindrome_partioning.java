package monu_bhaiya_recursion_Questions;

public class Palindrome_partioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		pp(str,"");

	}

	private static void pp(String str, String string) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			System.out.println(string);
			return;
		}
		for(int i=1;i<=str.length();i++)
		{
			String s=str.substring(0,i);
			if(isPalin(s))
			pp(str.substring(i),string+s+"| ");
		}
		
	}
	public static boolean isPalin(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
		
	}

}
