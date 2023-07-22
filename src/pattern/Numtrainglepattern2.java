package pattern;

public class Numtrainglepattern2 {

	public static void main(String[] args) {
		int n=1;
		for(int i=n; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
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
