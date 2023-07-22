package programs;

public class Mul3minimumnum {

	public static void main(String[] args) {
		int[] a= {3,1,5,4,8};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		int mul=1;
		for(int i=0; i<3; i++)
		{
			mul=mul*a[i];
		}
		System.out.println("Multiplication of 3 minimum num in array is "+mul);


	}

}
