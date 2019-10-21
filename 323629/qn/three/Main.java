package qn.three;
import java.util.*;
 class UserMainCode 
{

	public static String getStringUsingNthCharacter(String s,int x)
	{
		String result="";
		int len=x;
		result+=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			if(i+1==len)
			{
				result+=s.charAt(i);
				len=len+x;
			}
		}
		
		
		
		return result;
	}
}
	public class Main
	{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String str=UserMainCode.getStringUsingNthCharacter(s,n);
		System.out.println(str);

	}

	}
