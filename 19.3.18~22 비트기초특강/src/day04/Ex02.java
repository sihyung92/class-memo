package day04;

import java.util.Scanner;

//�л�5�����������޾Ƽ�
//������ ����� ����ϴ� ���α׷�
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] scoreList = new int[5];

		for(int i = 0 ; i < scoreList.length;i++) { 
			System.out.print((i+1)+"��° �л��� ������ �Է��ϼ���: ");
			scoreList[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < scoreList.length;i++) {
			sum +=scoreList[i];
		}
		for (int i =0; i < scoreList.length;i++) {
			System.out.println((i+1)+"��° �л��� ������ "+scoreList[i]+"���Դϴ�.");
			
		}
		System.out.println("�л����� ������ " +sum + "���Դϴ�.");
		System.out.println("�л����� ����� "+(sum / 5.0f)+"���Դϴ�.");
	}
}
