package str;

public class BreakandContinue {

	public static void main(String[] args) {
		System.out.println("expression1");
		start:
			for(int i=0;i<3;i++)
				for(int j=0;j<4;j++)
					if(j==2)
						break start;//��ֹ��ѭ��
					else
						System.out.println(i+":"+j);
		System.out.println("expression2");
		start:
			for(int i=0;i<3;i++)
				for(int j=0;j<4;j++)
					if(j==2)
						continue start;//�൱��ÿ��j=2ʱ��������ѭ��:for(int j=0;j<2;j++)
					else
						System.out.println(i+":"+j);
	}
}
