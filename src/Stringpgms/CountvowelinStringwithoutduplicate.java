package Stringpgms;

import java.util.LinkedHashSet;

public class CountvowelinStringwithoutduplicate {

	public static void main(String[] args) {
		String s="India";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		int count=0;
		for(Character ch: set)
		{
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.print(ch);
			}
		}
		
		System.out.println(count);
	}

}
