package day02;

public class Ex09 {
	public static void main(String[] args) {
		//       1        2     4
		for (int i = 0; i < 5; i++) {
		//           3  �̶�� �Ѵٸ�, ��������� 1->2->3->4->2->3->4->...�̴�.
			// �ݺ������� ����� ������ �ݺ����� ����� �Ŀ��� ��ȿ�̴�.
			System.out.println(i);
			//       5        6     7
			for (int j = 0; j < 3; j++) {
				//       8
				// ��������� 1->2->3->5->6->8->7->6->8->7->...6->4->2->3->5->6->8->7...6->4->2->3->5->6...
				System.out.println(j);
			}
		}
	}
}
