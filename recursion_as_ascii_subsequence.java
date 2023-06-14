package monu_bhaiya_recursion_Questions;

public class recursion_as_ascii_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ab";
		  System.out.println("\n"+print(str,""));

	}

	private static int print(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return 1;
		}
		  char ch=str.charAt(0);
		 int q= print(str.substring(1),ans);

		 int r= print(str.substring(1),ans+ch);

		  int s=print(str.substring(1),ans+(int)ch);
		  return s+q+r;
		
	}

}
