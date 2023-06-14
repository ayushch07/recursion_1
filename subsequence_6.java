package monu_bhaiya_recursion_Questions;

public class subsequence_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		ss(str,"");

	}
	public static void ss(String ques,String ans)
	{
		if(ques.length()==0)
		{	System.out.println(ans);
		return;
		}
		char ch=ques.charAt(0);
		ss(ques.substring(1),ans);
		ss(ques.substring(1),ans+ch);
		
	}
	
	//Count ke liye ya to static variable leleo or count++ kardo base case me.
	//Dusra tarika hai ss ke sammen int s1 or int s2 kardo or return s1+s2 kardo.base case me return 1 karde.
	//Count ko subsequence ke neeche laane ke lie main function me syso me slash n likho pahle phir function call karo.

}
