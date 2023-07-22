package programs;

public class Firstmaximumnum {

	public static void main(String[] args) {
		int[] arr= {13,15,6,5,18};
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				{
					max=arr[i];
				}
			
		}
		System.out.println("first maximum number in array is "+max);
	}

}
