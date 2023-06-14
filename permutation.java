package monu_bhaiya_recursion_Questions;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
		perm(s,"");

	}

	private static void perm(String s, String ans) {
		// TODO Auto-generated method stub4
		if(s.length()==0)
		{
			System.out.println(ans);
		}
		for(int  i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String ros=s.substring(0,i)+s.substring(i+1);
			perm(ros,ch+ans);
		}
		//agla question hhvv vvhh wala hai.
		//keypad phone waala.
		
	}

}
