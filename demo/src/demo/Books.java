package demo;

public class Books 
{
	String name;
	String press;
	double price;
	Books(String name,String press,double price)
	{
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public String showinfo()
	{
		return "����"+this.name+",������:"+this.press+"price"+price;
	}
	public String ToString()
	{
		return "����"+this.name+",������:"+this.press+"price"+price;
	}
}
