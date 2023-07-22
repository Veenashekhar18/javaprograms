package programs;

public class Firstminimumnum {

	public static void main(String[] args) {
		int[] arr= {13,15,6,5,18};
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
				{
					min=arr[i];
				}
			
		}
		System.out.println("first minimum number in array is "+min);
	}

}
