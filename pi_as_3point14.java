package monu_bhaiya_recursion_Questions;

public class pi_as_3point14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xpipipippx";
		String ans="";
		ans=ans+str.charAt(0);
		print(str.substring(1),ans);

	}

	private static void print(String ques, String ans) {
		// TODO Auto-generated method stub
		 if(ques.length()==0)
		 {
			 System.out.println(ans);
			 return;
		 }
		  if(ans.charAt(ans.length()-1)=='p' && ques.charAt(0)=='i')
		  {
			  print(ques.substring(1),ans.substring(0,ans.length()-1)+"3.14");
		  }
		  else
		  {
			  print(ques.substring(1),ans+ques.charAt(0));
		  }
		
	}

}
