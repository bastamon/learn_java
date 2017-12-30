package practice;
import java.io.*;
//import java.lang.string.split;


class Person 
{
	protected int age;
	protected String name;
	public Person(String na,int ag)
	{
		age=ag;name=na;		
	}
	public void print()
	{
		System.out.println("the object of "+this.getClass().getName()+":"+name+","+age);
	}
	public void olderoryounger(Person p)
	{
		int d=this.age-p.age;
		System.out.println(this.name+"is ");
		if(d>0)
			System.out.println("older than");
		else if(d==0)
			System.out.println("same as");
		else
			System.out.println("smaller than");
		System.out.println(p.name);
	}
}
class Student extends Person
{
	String address,department;
	public Student(String na,int ag,String ad,String de) 
	{
		super(na,ag);
		address=ad;
		department=de;
	}
	public void print()
	{
		super.print();
		System.out.println("the other information about student is "+address+", "+department);
	}
	
}


public class Student_ex 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入人类信息：名字，年龄");
		String[] str=buf.readLine().split(",");
		Person pe=new Person(str[0],Integer.parseInt(str[1]));
		Student st=new Student(str[0],Integer.parseInt(str[1]),null,null);
		System.out.println("请输入学生信息：地址，专业");
		str=buf.readLine().split(",");
		st.address=str[0];
		st.department=str[1];
		st.olderoryounger(pe);		
		System.out.println("请输入学生信息：名字,年龄,地址,专业");
		str=buf.readLine().split(",");
		Student st1=new Student(str[0],Integer.parseInt(str[1]),str[2],str[3]);
		st1.olderoryounger(pe);
		Person pe1=new Person("魏艳华",20);
		pe1.olderoryounger(pe);
		System.in.read();
	}

}
