package programs;

public class Sumof3maximumnum {

	public static void main(String[] args) {
		int[] a= {3,1,5,4,8};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of 3 maximum num in array is "+sum);

	}

}
