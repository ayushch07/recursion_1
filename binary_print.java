package monu_bhaiya_recursion_Questions;

public class binary_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="100??1?10?";
		 print(str,"");
	}

	private static void print(String str, String string) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			System.out.println(string);
			return;
		}
		 char ch=str.charAt(0);
		 if(ch=='?')
		 {
			   print(str.substring(1),string+'0');

			   print(str.substring(1),string+'1');
		 }
		 else
		 {

			   print(str.substring(1),string+ch);
		 }
		
	}

}
