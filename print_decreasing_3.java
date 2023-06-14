package monu_bhaiya_recursion_Questions;

public class print_decreasing_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pd(5);

	}
	public static void pd(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		pd(n-1);

		System.out.println(n);//1 2 3 4 5
		
	}
	//last return ke baad immediate main me call to  tail recursion hota hai.

}
