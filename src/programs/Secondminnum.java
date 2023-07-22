package programs;

public class Secondminnum {

	public static void main(String[] args) {
	int[] a= {0,5,2,0,1};
	int fmin=a[0];
	int smin=a[1];
	for(int i=0; i<a.length; i++)
	{
		if(a[i]<=fmin)
		{
			if(a[i]!=fmin) {
				smin=fmin;
			}
			
			fmin=a[i];
			
		}
		else if(smin==fmin || smin>a[i])
		{
			smin=a[i];
		}
	}
	System.out.println(fmin);
	System.out.println(smin);
	}

}
