package practice;
public class RandAdd {
	int i;
	RandAdd()
	{	
		i=(int) (10+290*Math.random());	
	}
	public static void main(String[] args) 
	{
		RandAdd a=new RandAdd();
		RandAdd b=new RandAdd();
		System.out.println(a.i+"+"+b.i+"="+a.i+b.i);
	}

}
