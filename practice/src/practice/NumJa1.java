package practice;

import java.io.*;

public class NumJa1 
{	
	int s=0;
	NumJa1(String str)
	{	
		for(int num1=Integer.parseInt(str);num1<100;num1++)
			s+=num1;			
	}

	public static void main(String[] args) throws IOException  
	{	
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ÇëÊäÈëÕûÊý");
		String str=buf.readLine();
		NumJa1 p= new NumJa1(str);
		System.out.println("the sum is "+p.s);
	}

}
