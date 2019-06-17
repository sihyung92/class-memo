package day01;
/*
 * printf 사용하기
 *printf는 %를 사용하며 데이터타입에 맞는 값을 자동적으로 넣게 된다.
 *%d(십진법) -> int, %f -> float, %s -> String
 *%x(16진법) -> 16진법
 *또한 %d를 %03d, %-3d를 쓰게 되면 앞에 빈 공간을 0으로 채우거나 왼쪽 줄맞춤을 할 수 있게 된다.
 *%f의 경우 %.2f(두자리), %.4f(4자리)를 하여 소숫점을 표시할 자릿수를 정해줄 수 있다.
*/
public class Ex06 {
	public static void main(String[] args) {
		int a = 18;
		float b = 3.1415f;
		
		System.out.printf("%d, %05d, %-10d, %.2f, %.4f\n", a, a, a, b, b);
		//설정과 변수의 갯수를 맞춰야 함, %-nd의 경우 n의 수만큼 공백이 생김, %.nf의 경우 뒷자릿수내림으로 출력됨.
		//printf의 경우에는 줄바꿈문자가 자동으로 출력이 안되기 때문에 따로 줄바꿈 문자를 입력해줘야 한다.
		//줄바꿈문자는 \n 이다. 탭을 표현하고 싶으면 \t를 넣으면 된다.
		System.out.printf("%s\n","abc");
		System.out.printf("%s\t%x","hexadecimal",a);
	}
}
