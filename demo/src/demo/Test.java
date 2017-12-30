package demo;
import java.util.ArrayList;
public class Test {
	
	public static void main(String[] args) 
	{
		//ArrayList<Books> list=new ArrayList<Books>();
		ArrayList list=new ArrayList();//不使用泛型
		/*list.add("hello");
		list.add(true);
		list.add(3.14);*/
		list.add(new Books("红楼梦","人民大学出版社",150));
		list.add(new Books("三国演义","复旦大学出版社",150));
		list.add(new Books("水浒传","中国政法大学出版社",110));
		list.add(new Books("西游记","人民邮电出版社",98));
		for(int i=0;i<list.size();i++)
		{
			Books b=(Books)list.get(i); //不使用泛型,则必须要使用强制类型转换
			System.out.println(b.showinfo());	
			//System.out.println(list.get(i).showinfo());
		}
		
	}
//泛型增强健壮性安全性,另外无需数据转化方便了遍历
}
