package demo;
import java.util.ArrayList;
public class Test {
	
	public static void main(String[] args) 
	{
		//ArrayList<Books> list=new ArrayList<Books>();
		ArrayList list=new ArrayList();//��ʹ�÷���
		/*list.add("hello");
		list.add(true);
		list.add(3.14);*/
		list.add(new Books("��¥��","�����ѧ������",150));
		list.add(new Books("��������","������ѧ������",150));
		list.add(new Books("ˮ䰴�","�й�������ѧ������",110));
		list.add(new Books("���μ�","�����ʵ������",98));
		for(int i=0;i<list.size();i++)
		{
			Books b=(Books)list.get(i); //��ʹ�÷���,�����Ҫʹ��ǿ������ת��
			System.out.println(b.showinfo());	
			//System.out.println(list.get(i).showinfo());
		}
		
	}
//������ǿ��׳�԰�ȫ��,������������ת�������˱���
}
