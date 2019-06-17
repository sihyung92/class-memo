package day01;
//학생의 이름, 국영수점수를 입력받아서 printf로 출력, 국영수점수는 3자리수로(빈자리는 0으로채워서)
//이름 국어 영어 수학순으로, 각 출력사이는 탭공백을 넣어서
//ex) 조재영	088	100	004
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("이름을 입력해주세요.");
		String name = scan.nextLine();
		System.out.print ("국어점수를 입력해주세요.");
		int kor = scan.nextInt();
		System.out.print ("영어점수를 입력해주세요.");
		int eng = scan.nextInt();
		System.out.print ("수학점수를 입력해주세요.");
		int math = scan.nextInt();
		System.out.printf ("%s\t%03d\t%03d\t%03d\t", name,kor,eng,math);
				
	}
}
