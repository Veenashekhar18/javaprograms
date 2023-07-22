package Stringpgms;

public class Removespacebetweenthestring {

	public static void main(String[] args) {
		String s="Im a sdet engineer";
		String sa[]=s.split(" ");
		for(int i=0;i<sa.length;i++) {
			System.out.print(sa[i]);
		}	
	}

}
