package pattern;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++)
			// i=1 1<=5t
			// j=2 j<=5t
			// j=3 j<=5t
			// j=4 j<=5t
			// j=5 j<=5t
			// j=6 j<=5f terminates
		{
			for(int j=1; j<=n; j++)
				// j=1 j<=5t
				// j=2 j<=5t
				// j=3 j<=5t
				// j=4 j<=5t
				// j=5 j<=5t
				// j=6 j<=5f
			{
				System.out.print("*"); // * * * * * 
				                       // * * * * *
				                       // * * * * *
									   // * * * * *
				                       // * * * * *
			}
			System.out.println(" ");
		}

	}

}
