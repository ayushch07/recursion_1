package monu_bhaiya_recursion_Questions;

public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toh(n,"S","H","D");

	}

	private static void toh(int n, String src, String help, String des) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return;
		}
		toh(n-1,src,des,help);
		System.out.println("Move disk "+n+" from  "+src+" to "+des);
		toh(n-1,help,src,des);
		
	}

}
