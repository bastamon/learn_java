package str;

class Circle
{
	private double Radius=0,PI=3.14;
	Circle(double r)
	{
		Radius=r;
	}
	public void setRadius(double r)
	{
		Radius=r;
	}
	public double getRadius()
	{
		return Radius;
	}
	public double getarea()
	{
		return PI*Radius*Radius;
	}
}
public class PassByValue 
{
	public void change(int y)
	{
		y=y<<1;
		System.out.println("y="+y);		
	}
	public void change(Circle cc)
	{
		cc.setRadius(100);
	}
	public static void main(String[] args) 
	{
		PassByValue pv=new PassByValue();
		int x=100;
		pv.change(x);
		System.out.println("x="+x);
		Circle c=new Circle(10);
		System.out.println("c�İ뾶"+c.getRadius());
		pv.change(c);
		System.out.println("c�İ뾶"+c.getRadius());
	}
}
