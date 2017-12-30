package str;

class Person2
{
	protected String name;
	protected int age;
	public Person2(String na,int ag)
	{
		name=na;
		age=ag;
	}
	public void olderoryounger(Person2 p)
	{
		int d;
		d=this.age-p.age;
		System.out.print(this.name+"is");
		if(d>0)
			System.out.println("older than"+p.name);
		else if(d==0)
			System.out.println("same as"+p.name);
			else System.out.println("younger than"+p.name);
	}
	public void print()
	{
		System.out.println("The object of"+this.getClass().getName()+":"+name+","+age);
	}
}

class Student2 extends Person2
{
	String address;
	String department;
	public Student2(String na,int ag,String ad,String de)
	{
		super(na,ag);
		address=ad;
		department=de;
	}
	public void print()
	{
		super.print();
		System.out.println("The other information of student:"+address+","+department);
	}
}
public class Student2_ex 
{
	public static void main(String[] args) 
	{
		Person2 pe=new Person2("Tom",20);
		Student2 st=new Student2("John",19,"336 West Street","Computer");
		pe.print();
		pe.olderoryounger(st);
	}

}
