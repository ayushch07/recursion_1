package monu_bhaiya_recursion_Questions;

public class recursion_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1125";
     print(str,"");
	}
	static String arr[]= {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	

	private static void print(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String s=arr[ch-48];
		print(ques.substring(1),ans+s);
		if(ques.length()>=2)
		{
			String s1=ques.substring(0,2);
			int n=Integer.parseInt(s1);
			if(n<=26)
			print(ques.substring(2),ans+arr[n]);
		}
	}

}
