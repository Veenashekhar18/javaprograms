package Stringpgms;

public class Reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Im a sdet engineer";
		String sa[]=s.split(" ");
		
		for(int i=sa.length-1;i>=0;i--) {
			System.out.print(sa[i]+" ");
		}
	}

}
