package qn.two;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	class UserMainCode{
	public static int calculateElectricityBill(String oldu,String newu,int rate){
		char[] n=oldu.toCharArray();
		char[] o=newu.toCharArray();
		int len=oldu.length();
		int old=1,ne=1;
		for(int i=0;i<len;i++){
			old=old*10+n[i];
			ne=ne*10+o[i];
		}
		int x=(ne-old)*rate;
		return x;
	}
}
	
	public class Main
{
	public static void main(String[] args) {
		String oldu="";
		String newu="";
		int rate=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			oldu=br.readLine();
			newu=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rate=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int bill= UserMainCode.calculateElectricityBill(oldu,newu,rate);
		System.out.println(bill);
	}
}
