package programs;

public class Findprimenum1to20 {

	public static void main(String[] args) {
		for(int i=1; i<=20; i++)
		{
			int no=i;
			int count=0;
			for(int j=1; j<=no; j++)
			{
					if(no%j==0)
					{
						count++;
					}
			}
			if(count==2)
			{
				System.out.println(no+" is a prime number");
			}
		}

	}

}
