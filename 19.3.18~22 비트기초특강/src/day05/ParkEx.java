
package day05;

import java.util.Scanner;

public class ParkEx {
	final static int SIZE = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Park[] parkList = new Park[SIZE];
		for(int i=0; i<parkList.length;i++) {
			parkList[i] = new Park();// ����10���� �迭;
		}
		Park operator = new Park();
		while (true) {
			System.out.print("1.�����԰� 2.������� 3.����");
			int choN = scan.nextInt(); // choN = choice number
			if (choN == 3) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			} else if (choN == 1) {
				operator.newPark(parkList);
			} else {
				operator.outPark(parkList);
			}
		}
	}
}
