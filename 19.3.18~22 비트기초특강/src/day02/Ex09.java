package day02;

public class Ex09 {
	public static void main(String[] args) {
		//       1        2     4
		for (int i = 0; i < 5; i++) {
		//           3  이라고 한다면, 실행순서는 1->2->3->4->2->3->4->...이다.
			// 반복문에서 사용한 변수는 반복문이 종료된 후에는 무효이다.
			System.out.println(i);
			//       5        6     7
			for (int j = 0; j < 3; j++) {
				//       8
				// 실행순서는 1->2->3->5->6->8->7->6->8->7->...6->4->2->3->5->6->8->7...6->4->2->3->5->6...
				System.out.println(j);
			}
		}
	}
}
