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
		return "书名"+this.name+",出版社:"+this.press+"price"+price;
	}
	public String ToString()
	{
		return "书名"+this.name+",出版社:"+this.press+"price"+price;
	}
}
