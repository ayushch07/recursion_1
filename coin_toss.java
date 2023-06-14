package monu_bhaiya_recursion_Questions;

public class coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		ct(n,"");

	}

	private static void ct(int n, String ans ) {
		
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
		ct(n-1,ans+"H");

		ct(n-1,ans+"T");
		
	}

}
