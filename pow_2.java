package monu_bhaiya_recursion_Questions;

public class pow_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=5;
		System.out.println(pow(a,b));

	}

	private static int pow(int a, int b) {
		
		// TODO Auto-generated method stub
		if(b==0)
			return 1;
		int ans=pow(a,b-1);
		return ans*a;
	}

}
