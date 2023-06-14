package monu_bhaiya_recursion_Questions;

import java.util.Scanner;

public class codeforce_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        	
           int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        	arr[i]=sc.nextInt();
        		int s=0,c=0;
        for(int i=0;i<arr.length;i++)
        {
        	s=arr[i];
        	
        	for(int j=0;j<arr.length;j++)
        	{
        		c=0;
        		for(int k=0;k<arr.length;k++)
        		{
        			if(s-arr[j]==arr[k] && s!=arr[k] && s!=arr[j] && arr[j]!=arr[k])
        			{
        				//s=arr[j];
        				c=1;
        				break;
        			}
        		}
        		if(c==1)
        			break;
        	}
        	if(c==1)
        		break;
        }
         System.out.println(s);
        }
     
    }
}
    
   