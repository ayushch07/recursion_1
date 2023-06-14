package monu_bhaiya_recursion_Questions;

public class valid_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
  vp(n,0,0,
		  
		  
		  "");
	}

	private static void vp(int n,int open,int close,String ans) {
		
		// TODO Auto-generated method stub
		if(open==n && close==n)
		{
			System.out.println(ans);
			return;
		}
		if(open<n)
		
		{
			vp(n,open+1,close,ans+"(");
		}
		if(close<open)
		{
			vp(n,open,close+1,ans+")");
		}
		
	}

}
