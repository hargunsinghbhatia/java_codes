package qn.four;
import java.util.Scanner;
class UserMainCode 
{
	public static int getElementPosition(String[] str, String output, int len){
		String temp;
		int x=0;
		for (int i = 0; i < len; i++) 
	    {
	        for (int j = i + 1; j < len; j++) 
	        {
	            if (str[i].compareTo(str[j])>0) 
	            {
	                temp = str[i];
	                str[i] = str[j];
	                str[j] = temp;
	            }
	        }
	    }
		int y=len-1;
		String[] str1=new String[20];
		for(int m=0;m<len;m++)
		{
			str1[m]=str[y];
			y--;
		}
		
		for(int i=0;i<len;i++)
		{
			if(str1[i].equals(output))
			{
				x= i+1;
			}
		}
		
		return x;
	}
}
	
public class Main
	{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();
		String[] str = new String[20];
		for(int i=0;i<n;i++){
			str[i]= input.nextLine();
		}
		String out= input.nextLine();
		int q=UserMainCode.getElementPosition(str,out,n);
		System.out.println(q);
	}

	}


