package Stringpgms;

import java.util.LinkedHashSet;

public class Countcharpositionfromlast {

	public static void main(String[] args) {
		String s="kannada";
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		

		for(Character c:lhs) {
			for(int j=s.length()-1;j>=0;j--) {
						if(c==s.charAt(j)) {
					System.out.println(c+" is in "+(j+1)+" position");
					break;
				}
			}
		}

	}

}
