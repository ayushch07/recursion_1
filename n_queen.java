package monu_bhaiya_recursion_Questions;

public class n_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean arr[][]=new boolean[n][n];
		printpath(arr,0,n);

	}

	private static void printpath(boolean[][] arr, int r, int tq) {
		// TODO Auto-generated method stub
		if(tq==0)
		{
			display(arr);
			return;
		}
		if(r==arr.length)
			return;
		 for(int c=0;c<arr.length;c++)
		 {
			 if(isitpossible(arr,r,c))
			 {
				    arr[r][c]=true;
				      printpath(arr,r+1,tq-1);
				      arr[r][c]=false;
			 }
		 }
		
		
	}

	private static void display(boolean[][] arr) {
		// TODO Auto-generated method stub
		      for(int i=0;i<arr.length;i++)
		      {
		    	  for(int j=0;j<arr[0].length;j++)
		    	  {
		    		  System.out.print(arr[i][j]+" ");
		    	  }
		    	  System.out.println();
		      }
		      System.out.println(" * * * * * * * * ");
		
	}

	private static boolean isitpossible(boolean[][] arr, int row, int col) {

		//upper case
		int r=row;
		while(r>=0)
		{
			if(arr[r][col]==true)
				return false;
			r--;
		}
		//left diagonal
		r=row;
		int c=col;
		 	while(r>=0 && c>=0)
		 	{
		 		if(arr[r][c]==true)
		 			return false;
		 		r--;
		 		c--;
		 	}
		 	//right diagonal
		 	r=row;
			 c=col;
			 	while(r>=0 && c<arr.length)
			 	{
			 		if(arr[r][c]==true)
			 			return false;
			 		r--;
			 		c++;
			 	}
			 	
		 	
		 	
		
		return true;
	}

}
