package str;

import java.util.Scanner;

public class LeapYear 
{
	LeapYear(int mo,int ye)
	{
		int count = 0;
		switch(mo)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:count=31;break;
		case 4:
		case 6:
		case 9:
		case 11:count=30;break;
		case 2:
			if(ye%4==0&&ye%100!=0)
				count=29;
			else count=28;
			break;
		}
		System.out.println(ye+"/"+mo+" has "+count+" days");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄê/ÔÂ");
		String[] s=sc.next().split("/");
		@SuppressWarnings("unused")
		LeapYear daycount =new LeapYear(Integer.parseInt(s[1]),Integer.parseInt(s[0]));		
	}
}
