package monu_bhaiya_recursion_Questions;

public class factorial_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
		

	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		int fn=fact(n-1);
		return fn*n; 
		
	}

}
