package qn.one;
import java.util.Scanner;
	class UserMainCode {
		
		public static String removeEvenVowels(String s)
		{
			char[] str= s.toCharArray();
			int n=s.length();
			for(int i=0;i<n;i++){
				if(i%2 != 0 && (str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u')){
					str[i]='1';
				}
			}
			String m= new String(str);
			m= m.replaceAll("1", "");
			return m;
		}
	}
	public class Main
	{
		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			String s= input.nextLine();
			String r=UserMainCode.removeEvenVowels(s);
			System.out.println(r);
		}
	}

