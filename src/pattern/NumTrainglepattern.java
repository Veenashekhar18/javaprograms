package pattern;

public class NumTrainglepattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>0; i--)
		{
			for(int j=1; j<=n; j++)
			{
				if(i<=j)
				{
					System.out.print(i+" ");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
