package monu_bhaiya_recursion_Questions;

public class twins_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str="AXAXAXsSAXAXAXAX";
		count(str);
		System.out.println(count(str));
	}
	
	public static int count(String str)
	{
		 if(str.length()<3)
		 {
			 return 0;
		 }
		 int c=0;
		char ch=str.charAt(0);
		 if(ch==str.charAt(2))
		 {
			
			c++;
		 }
		 c=c+count(str.substring(1));
		 return c;
		
		
	}

}
