package monu_bhaiya_recursion_Questions;
import java.util.*;

public class rate_in_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char maze[][]=new char[n][m];
		for(int i=0;i<maze.length;i++)
		{
			String s=sc.next();
			for(int j=0;j<maze[0].length;j++)
			{
				maze[i][j]=s.charAt(j);
			}
		}
		int arr[][]=new int[n][m];
		printpath(maze,0,0,arr);
		

	}


	private static void printpath(char[][] maze, int cr, int cc, int[][] arr) {
		
		if(cr==maze.length-1 && cc==maze[0].length)
		{
		
			
			display(arr);
			return;
       
		
	
			}
		if(cr<0 || cc<0 || cc>=maze[0].length  || cr>=maze.length || maze[cr][cc]=='X')
			return;
		int r[]= {0,-1,0,1};
		  int c[]= {1,0,-1,0};
		  maze[cr][cc]='X';
		  arr[cr][cc]=1;
		  for(int i=0;i<c.length;i++)
		  {
			  printpath(maze,cr+r[i],cc+c[i],arr);
			
		  }
		  maze[cr][cc]='0';
		  arr[cr][cc]=0;
		  
		
		  
		  
		
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//iske baad word search ka question.

}
