package str;

public class Fintest {
	int n;
	Fintest(int i)
	{
		n=i;
	}
	public void finalize()
	{
		System.out.println("disappare"+n);
	}
	public void create(int i)
	{
		new Fintest(i);
	}
	public static void main(String[] args) 
	{
		int j;
		Fintest dx=new Fintest(1);
		for(j=1;j<10000;j++)
		{
			dx.create(j);
		}

	}

}
