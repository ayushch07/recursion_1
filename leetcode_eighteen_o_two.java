package monu_bhaiya_recursion_Questions;

public class leetcode_eighteen_o_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSum=21;
				int index=1;
				int n=2;
		 sum(maxSum,0,"",index,n);
		 System.out.println(m);

	}
	 static int m=0;
		public static void sum(int end,int curr,String ans,int index,int n)
		{
			if(curr==end)
			{
				if(ans.length()==n)
					
				{
//					int f=1;
//					for(int i=0;i<ans.length()-1;i++)
//					{
//						    char c1=ans.charAt(i);
//								char c2=ans.charAt(i+1);
//								int a=c1-48;
//								int b=c2-48;
//								if(Math.abs(a-b)<=1)
//								{
//									f=1;
//								}
//								else
//								{
//									f=0;
//									break;
//								}
//					}
//					if(f==1)
//					{
//						 char cc=ans.charAt(index);
//						 int aa=cc-48;
//						 System.out.println(ans)
//						// m=Math.max(m,aa);
//						 return;
//						
//					}
//					else
//					{
//						
//						return;
//	          
//					}
				
				

				

					 System.out.println(ans);
				       
			
				}
				}
			
			if(curr>end)
			{
				return;
			}
			for(int i=1;i<=end;i++)
			{
			
				sum(end,curr+i,ans+i,index,n);
			}
		}
	}


