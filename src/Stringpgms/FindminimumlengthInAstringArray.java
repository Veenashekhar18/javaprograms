package Stringpgms;

public class FindminimumlengthInAstringArray {

	public static void main(String[] args) {
		String[] s= {"ab","abc","bd","abcd","abcde"};
		String min_length=s[0];
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()<min_length.length())
			{
				min_length=s[i];
			}
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==min_length.length())
			{
				System.out.println(s[i]+" ");
			}
		}
	}

}
