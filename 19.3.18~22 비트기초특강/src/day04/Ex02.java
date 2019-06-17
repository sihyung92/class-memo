package day04;

import java.util.Scanner;

//학생5명의점수를받아서
//총점과 평균을 계산하는 프로그램
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] scoreList = new int[5];

		for(int i = 0 ; i < scoreList.length;i++) { 
			System.out.print((i+1)+"번째 학생의 점수를 입력하세요: ");
			scoreList[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < scoreList.length;i++) {
			sum +=scoreList[i];
		}
		for (int i =0; i < scoreList.length;i++) {
			System.out.println((i+1)+"번째 학생의 점수는 "+scoreList[i]+"점입니다.");
			
		}
		System.out.println("학생들의 총점은 " +sum + "점입니다.");
		System.out.println("학생들의 평균은 "+(sum / 5.0f)+"점입니다.");
	}
}
