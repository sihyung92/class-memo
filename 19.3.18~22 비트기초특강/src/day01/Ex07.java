package day01;
//�л��� �̸�, ������������ �Է¹޾Ƽ� printf�� ���, ������������ 3�ڸ�����(���ڸ��� 0����ä����)
//�̸� ���� ���� ���м�����, �� ��»��̴� �ǰ����� �־
//ex) ���翵	088	100	004
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("�̸��� �Է����ּ���.");
		String name = scan.nextLine();
		System.out.print ("���������� �Է����ּ���.");
		int kor = scan.nextInt();
		System.out.print ("���������� �Է����ּ���.");
		int eng = scan.nextInt();
		System.out.print ("���������� �Է����ּ���.");
		int math = scan.nextInt();
		System.out.printf ("%s\t%03d\t%03d\t%03d\t", name,kor,eng,math);
				
	}
}
