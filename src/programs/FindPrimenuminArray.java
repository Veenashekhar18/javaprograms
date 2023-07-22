package programs;

public class FindPrimenuminArray {

	public static void main(String[] args) {
		int[] arr={1,3,2,4,5,7};
		for(int i=0; i<arr.length; i++)
		{
			int c=arr[i];
			int count=0;
			
			for(int j=1; j<=c; j++)
				
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]+" is a prime number");
			}
			else
			{
				System.err.println(arr[i]+" is not a prime number");
			}
		}

	}

}
