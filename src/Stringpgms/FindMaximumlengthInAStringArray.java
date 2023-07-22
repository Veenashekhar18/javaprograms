package Stringpgms;

public class FindMaximumlengthInAStringArray {

	public static void main(String[] args) {
		String[] s= {"ab","abc","bd","abcd","abcde"};
		String max_length=s[0]; //ab
		for(int i=0; i<s.length; i++) //0<5 
		{			
			if(s[i].length()>max_length.length()) //s[0]=2 is greater than s[0] then enter if block
			{
				max_length=s[i];
			}
		}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==max_length.length())//if s[i] length is wequal to 
			{
				System.out.println(s[i]+" ");
			}
		}
	}

}
