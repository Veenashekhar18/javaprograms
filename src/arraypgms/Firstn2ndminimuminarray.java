package arraypgms;

public class Firstn2ndminimuminarray {

	public static void main(String[] args) {
		int arr[]= {1,1,8,2,3,1};

		int fmin=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=fmin) 
			{
				if(arr[i]<fmin) 
				{
					smin=fmin;
				}
				fmin=arr[i];
			}
			else if(fmin==smin || smin>arr[i])
			{
				smin=arr[i];
			}
		}
		System.out.println(fmin);//
		System.out.println(smin);//
	}

}
