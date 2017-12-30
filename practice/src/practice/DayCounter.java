package practice;

import java.io.*;

public class DayCounter 
{
	public static int month,year;
	DayCounter(int month,int year)
	{
		int count=0;
		switch(month)
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
			if(year%4==0&&year%100!=0)
				count=29;
			else count=28;
			break;
		}
		System.out.println(month+"/"+year+" has "+count+" days ");
	}
	public static void main(String[] args) throws IOException
	{
		for(int i=5;i>0;i--)
		{
			BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入年");
			year=Integer.parseInt(buf.readLine());
			System.out.println("请输入月");
			month=Integer.parseInt(buf.readLine());
			new DayCounter(month,year);
		}
	}
}
