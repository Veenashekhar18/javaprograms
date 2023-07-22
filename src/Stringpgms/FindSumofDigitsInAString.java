package Stringpgms;

public class FindSumofDigitsInAString {

	public static void main(String[] args) {
		String s="a2b1d3";
		int sum=0;
	for(int i=1; i<s.length(); i++)
	{
	    	char ch=s.charAt(i);
			if(ch>'0'&& ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}

}
