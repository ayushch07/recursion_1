package monu_bhaiya_recursion_Questions;

public class queen_settlement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_of_queen=2;
		boolean arr[]=new boolean[4];
		settle(arr,no_of_queen,"",0,-1);

	}

	private static void settle(boolean arr[],int no_of_queen, String ans, int tq,int idx) {
		// TODO Auto-generated method stub
		if(tq==no_of_queen)
		{
			System.out.println(ans);
			return;
		}
	    for(int i=idx+1;i<arr.length;i++)
	    {
	    	if(arr[i]==false)
	    	{
	    		arr[i]=true;
	    		settle(arr,no_of_queen,ans+"b"+tq+"q"+i+" ",tq+1,i);
	    		arr[i]=false;
	    	}
	    }
		
	}

}
