package monu_bhaiya_recursion_Questions;

public class first_occurence_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,4,5,6,7};
		int item=3;
		System.out.print(fo(arr,0,item));

	}

	private static int fo(int[] arr, int i, int item) {
		
		// TODO Auto-generated method stub
		if(i==arr.length)
			return -1;
		if(arr[i]==item)
			return i;
		return fo(arr,i+1,item);
		
	}
	

}
