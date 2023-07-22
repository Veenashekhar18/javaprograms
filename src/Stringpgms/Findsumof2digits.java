package Stringpgms;

public class Findsumof2digits {

	public static void main(String[] args) {
		String s="a11b12c3";
		//String n="";
		int sum=0; //0 11 23
		int tsum=0; //0 1 11 0 1 12 0 3
		//
		for(int i=0; i<s.length(); i++)
			// i=0 0<8t s.charAt(i)=a
			// i=1 1<8t s.charAat(i)=1
			// i=2 2<8t             =1
		{
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;//49-1=1
				tsum=tsum*10+n; //0*10+1=1 1*10+1=11
			}
			else {
				sum=sum+tsum; //0+11=11
				tsum=0;//0 0
			}
		}
		sum=sum+tsum;//26
		System.out.println(sum);
	}

}
