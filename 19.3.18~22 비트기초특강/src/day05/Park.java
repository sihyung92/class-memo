package day05;
import java.util.Scanner;
public class Park {
	private String carN; // ����ȣ
	private int inT; // �԰�ð�
	private int outT; // ���ð�
	public String getCarN() {
		return carN;
	}
	public void setCarN(String carN) {
		this.carN = carN;
	}
	public int getInT() {
		return inT;
	}
	public void setInT(int inT) {
		this.inT = inT;
	}
	public int getOutT() {
		return outT;
	}
	public void setOutT(int outT) {
		this.outT = outT;
	}
	public Park() {
		this.carN = "E";
		this.inT = 0;
		this.outT = 0;
	}
	private boolean checkEmptySpace(Park[] parkList) {
		boolean isEmpty = false;
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals("E")) {
				isEmpty = true;
				break;
			}
		} // ������ �ִ��� üũ�ϴ� �޼ҵ�
		return isEmpty;
	}
	private boolean checkCarHistory(Park[] parkList, String carN) {
		boolean isIn = false;
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals(carN)) {
				isIn = true;
				break;
			} // ���������� �԰�ƴ��� üũ�ϴ� �޼ҵ�
		}
		return isIn;
	}
	private boolean checkTime(int inT) {
		boolean isTimeCorrect = false;
		int hour = inT / 100;
		int min = inT % 100;
		if (hour > -1 && hour < 23) {
			if (min > -1 && min < 60) {
				isTimeCorrect = true;
			}
		}
		return isTimeCorrect;
	}
	private boolean checkOutTime(int inT, int outT) {
		boolean isOutTime = false;
		if (inT < outT && checkTime(outT)) {
			isOutTime = true;
		}
		return isOutTime;
	}// method�� ����Ҷ� ������Ÿ���߿� �������� ó���ɱ� �ñ��Ҷ� = ���ϵǴ� Ÿ���� �� method �� Ÿ����
	private void inCar(String carN, int inT, Park[] parkList) {
		Park newCar = new Park();
		newCar.setCarN(carN);
		newCar.setInT(inT);
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals("E")) {
				parkList[i] = newCar;
				break;
			}
		}
	}
	private boolean isCarIn(Park[] parkList) {
		boolean isCarIn = false;
		for (int i = 0; i < parkList.length; i++) {
			if (!parkList[i].getCarN().equals("E")) {
				isCarIn = true;
				break;
			}
		}
		return isCarIn;
	}
	private Park findCar(Park[] parkList, String carN) {
		Park park = new Park();
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals(carN)) {
				park = parkList[i];
			}
		}
		return park;
	}

	private void resetCar(Park[] parkList, String carN) {
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals(carN)) {
				parkList[i] = new Park();
				break;
			}
		}
	}
	private int calcRate(Park outCar) {
		int rate = 0;
		int hourDif = outCar.getOutT() / 100 - outCar.getInT() / 100;
		int minDif = outCar.getOutT() % 100 - outCar.getInT() % 100;
		rate = (hourDif * 60 + minDif) / 10 * 1000;
		return rate;
	}
	public void newPark(Park[] parkList) {
		Scanner scan = new Scanner(System.in);
		if (checkEmptySpace(parkList)) {
			System.out.println("���� ��ȣ�� �Է��� �ּ���. : ");
			String carN = scan.nextLine();
			while (checkCarHistory(parkList, carN)) {
				System.out.println("�̹� ������ �����Դϴ�. �ٽ� �Է����ּ���. :  ");
				carN = scan.nextLine();
			}
			System.out.println("�ð��� �Է����ּ��� : ");
			int inT = scan.nextInt();
			while (!checkTime(inT)) {// (checkTime(int)==false �� �Է��ϴ� ����� ����
				System.out.println("�߸� �� �ð��Դϴ�. �ð��� �ٽ� �Է����ּ���. : ");
				inT = scan.nextInt();
			}
			inCar(carN, inT, parkList);
		} else {
			System.out.println("�����Դϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
		}
	}
	public void outPark(Park[] parkList) {
		if (isCarIn(parkList)) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���� ��ȣ�� �Է��� �ּ���. : ");
			String carN = scan.nextLine();
			while (!checkCarHistory(parkList, carN)) {
				System.out.println("�԰���� ���� �����Դϴ�. �ٽ� �Է����ּ��� : ");
				carN = scan.nextLine();
			}
			System.out.println("�ð��� �Է����ּ���. : ");
			int outT = scan.nextInt();
			Park outCar = findCar(parkList, carN);
			while (!checkOutTime(outCar.getInT(), outT)) {
				System.out.println("�߸� �� �ð��Դϴ�. �ð��� �ٽ� �Է����ּ���. : ");
				outT = scan.nextInt();
			}
			outCar.setOutT(outT);
			resetCar(parkList, carN);
			System.out.println("��� �Ǿ����ϴ�. ���� ����� " + calcRate(outCar) + "�� �Դϴ�.");// ��� ���
		} else {
			System.out.println("������ �԰�� ����� �����ϴ�.");
		}
	}
}