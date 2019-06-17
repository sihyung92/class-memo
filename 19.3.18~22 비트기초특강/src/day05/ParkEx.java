
package day05;

import java.util.Scanner;

public class ParkEx {
	final static int SIZE = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Park[] parkList = new Park[SIZE];
		for(int i=0; i<parkList.length;i++) {
			parkList[i] = new Park();// 차량10대의 배열;
		}
		Park operator = new Park();
		while (true) {
			System.out.print("1.차량입고 2.차량출고 3.종료");
			int choN = scan.nextInt(); // choN = choice number
			if (choN == 3) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else if (choN == 1) {
				operator.newPark(parkList);
			} else {
				operator.outPark(parkList);
			}
		}
	}
}
