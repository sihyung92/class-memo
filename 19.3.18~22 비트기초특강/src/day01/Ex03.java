package day01;

public class Ex03 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		//������ Ÿ���� ��ȯ�� ���� 2���� ����� �ִ�.
		//�Ͻ��� ����ȯ, ����� ����ȯ
		//int*float -> float (�Ͻ���)
		float num4 = num1*1.0f;
		float num3 = num4 / num2;
		
		//size�� ū ������Ÿ�Կ��� ���� ���� �ڵ����� ����ȯ�ȴ�. (�Ͻ���)
		double num5 = num3;
		
		/*size�� ���� ������Ÿ�Կ� ū ���� �Ҵ����ַ��� �ϸ� 
		 * ����� ����ȯ�� �ʿ��ϴ�.
		 * ����� ����ȯ�� (�ٲ� ������Ÿ��)���� �Ѵ�.
		 */
		//float num6 = (float)num5;
		//String abc = new String();
		//Object a = new Object();
		//abc = (String)a;
		//Integer d = (Integer)a;
		//System.out.println(num3);	
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		//string + int = string(���ڿ� ���ڰ� ����)�� �ȴ�.
		//string���� +�� �� string�� �Ѱ��� �����Ű�� �������̴�.
		String aaaa = "12345";
		String bbbb = "56789";
		aaaa = aaaa+bbbb;
		System.out.println(aaaa);
		
		//float ���� 2��
		//3.5, 5.5�� ���� ��������ڸ� ����غ���
		float myFloat = 3.5f;
		float myFloat2 = 5.5f;
		System.out.println(myFloat + myFloat2);
		System.out.println(myFloat - myFloat2);
		System.out.println(myFloat * myFloat2);
		System.out.println(myFloat / myFloat2);
		System.out.println(myFloat % myFloat2);
		
		//myFloat = myFloat * 3;
		//myFloat *=3; ���Ʒ� ����
		int a = 4;
		int b = 5;
		System.out.println(a>3&&b>6);
		System.out.println(a>5&&b>6);
		System.out.println(a>3&&b>4);
		System.out.println(a>3||b>6);
		System.out.println(!(a>3));
		
	}
}
