package monu_bhaiya_recursion_Questions;

public class lexicograph_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int curr=0;
		lc(n,curr);

	}

	private static void lc(int n, int curr) {
		// TODO Auto-generated method stub
		if(curr>n)
		{
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			lc(n,curr*10+i);
		}
		
	}

}
