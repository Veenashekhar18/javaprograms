package Stringpgms;

public class Countvowelsinastring {

	public static void main(String[] args) {
		String s="India";
		String s1=s.toLowerCase();
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i' || ch[i]=='o'||ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]);
			}
		}
		System.out.println(count);
	}

}
