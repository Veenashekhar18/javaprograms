package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=0; i--)
		{
			for(int j=n; j>0; j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*for(int i=1; i<=n; i++)
			//i=1 i<=5t
		{
			for(int j=1; j<i; j++)
				//j=1 j<1f
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
				//j=i=1 j<=5t
			{
				System.out.print("* ");
			}
			System.out.println();
		}
*/
	}

}
