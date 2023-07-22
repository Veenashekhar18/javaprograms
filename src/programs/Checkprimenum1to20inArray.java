package programs;

public class Checkprimenum1to20inArray {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int n=num.length;
		for(int i=1; i<n; i++)
		{
			if(isprime(num[i]))
			{
				System.out.println("the provided "+num[i]+" is a prime number");
			}
		}

	}
public static boolean isprime(int n)
{
	boolean flag=true;
	if(n==1)
	{
		return false;
	}
	for(int i=2; i<=n/2; i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return flag;
}
}
