package demo;
import java.io.*;
public class Bubblesort 
{	
	private Bubblesort(String[] s,int []a) 
	{
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
	}
	
	public void Select(int []a,String str)throws IOException
	{
		int m=0,low=0,high;
		int x=Integer.parseInt(str);
		high=a.length-1;
		while(low<=high)
		{
			m=(high+low)/2;
			if(x==a[m])break;
			else if(x>a[m])low=m+1;
			else high=m-1;
		}
		if(low <=high)
			System.out.println(x+"found,located at:"+m);
		else System.out.println(x+"unfound");		
	}
	
		public static void main(String[] args)throws IOException
	{
		int []a=new int[50];
		System.out.println("the original number is:");
		BufferedReader im=new BufferedReader(new InputStreamReader(System.in));
		String s[]=im.readLine().split(" ");
		Bubblesort de1=new Bubblesort(s,a);
		for(int i=0;i<s.length;i++)
			System.out.print(a[i]+"\t");
		System.out.print("\nplease Input search key:");
		String key=im.readLine();
		de1.Select(a,key);
	}
}
