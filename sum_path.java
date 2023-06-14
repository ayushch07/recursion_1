package monu_bhaiya_recursion_Questions;

public class sum_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=18;
		sum(n,0,"");
		System.out.println(m);
	}
	static int m=0;
	public static void sum(int end,int curr,String ans)
	{
		if(curr==end)
		{
			
				//m=Math.max(c1-48, m);
				System.out.println(ans);
			       
			return;
			}
			
		
		if(curr>end)
		{
			return;
		}
		for(int i=1;i<=end;i++)
		{
			sum(end,curr+i,ans+i);
		}
	}

}
