package Stringpgms;

public class SegregateAlphbetsNumandSpecialchar {

	public static void main(String[] args) {
		String s="1b2%a3(t";
		String alp="";
		String sc="";
		String n="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				n=n+s.charAt(i);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alp=alp+s.charAt(i);
			}
			else
			{
				sc=sc+s.charAt(i);
			}
		}
		System.out.println(alp+" "+n+" "+sc);
		/*for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				alp=alp+ch;
			}
			else if(Character.isDigit(ch))
			{
				n=n+ch;
			}
			else
			{
				sc=sc+ch;
			}
		}*/
		//System.out.println(alp+" these are the alphabets present in a string");
		//System.out.println(n+" these are the numbers present in a string");
		//System.out.println(sc+" these are the special characters present in a string");
	}

}
