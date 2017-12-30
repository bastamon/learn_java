package demo;
import java.io.*;
public class Sort12 
{	
	public static void main(String[] args) throws IOException
	{
		System.out.println("the original number is:");
		BufferedReader im=new BufferedReader(new InputStreamReader(System.in));
		String []s=im.readLine().split(" ");
		int []a=new int[50];
		for (int i=0;i<s.length;i++ )
		{
			a[i]=Integer.parseInt(s[i]);		   
		}
		for(int i = 0;i<s.length-1;i++)
			for(int j=i;j<s.length;j++)
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		for(int i=0;i<s.length;i++)
			System.out.print(a[i]+"\t");		
	}
}
