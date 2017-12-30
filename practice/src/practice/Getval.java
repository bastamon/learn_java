package practice;

public class Getval {
	int a,b;
	Getval()
	{	
		int x=2,y=4,z=6;
		a=(x+y-2)*(2+z);
		b=x+y-2*2+z;
		
	}
	public static void main(String[] args)
	{
		Getval p=new Getval();
		System.out.println("(x+y-2)*(2+z)="+p.a);
		System.out.println("x+y-2*2+z="+p.b);
	}

}
