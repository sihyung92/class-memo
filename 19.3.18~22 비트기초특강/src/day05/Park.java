package day05;
import java.util.Scanner;
public class Park {
	private String carN; // 차번호
	private int inT; // 입고시간
	private int outT; // 출고시간
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
		} // 공간이 있는지 체크하는 메소드
		return isEmpty;
	}
	private boolean checkCarHistory(Park[] parkList, String carN) {
		boolean isIn = false;
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].getCarN().equals(carN)) {
				isIn = true;
				break;
			} // 같은차량이 입고됐는지 체크하는 메소드
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
	}// method를 사용할때 데이터타입중에 무엇으로 처리될까 궁금할때 = 리턴되는 타입이 그 method 의 타입임
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
			System.out.println("차량 번호를 입력해 주세요. : ");
			String carN = scan.nextLine();
			while (checkCarHistory(parkList, carN)) {
				System.out.println("이미 주차된 차량입니다. 다시 입력해주세요. :  ");
				carN = scan.nextLine();
			}
			System.out.println("시간을 입력해주세요 : ");
			int inT = scan.nextInt();
			while (!checkTime(inT)) {// (checkTime(int)==false 로 입력하는 방법도 있음
				System.out.println("잘못 된 시간입니다. 시간을 다시 입력해주세요. : ");
				inT = scan.nextInt();
			}
			inCar(carN, inT, parkList);
		} else {
			System.out.println("만차입니다. 초기화면으로 돌아갑니다.");
		}
	}
	public void outPark(Park[] parkList) {
		if (isCarIn(parkList)) {
			Scanner scan = new Scanner(System.in);
			System.out.println("차량 번호를 입력해 주세요. : ");
			String carN = scan.nextLine();
			while (!checkCarHistory(parkList, carN)) {
				System.out.println("입고되지 않은 차량입니다. 다시 입력해주세요 : ");
				carN = scan.nextLine();
			}
			System.out.println("시간을 입력해주세요. : ");
			int outT = scan.nextInt();
			Park outCar = findCar(parkList, carN);
			while (!checkOutTime(outCar.getInT(), outT)) {
				System.out.println("잘못 된 시간입니다. 시간을 다시 입력해주세요. : ");
				outT = scan.nextInt();
			}
			outCar.setOutT(outT);
			resetCar(parkList, carN);
			System.out.println("출고 되었습니다. 주차 요금은 " + calcRate(outCar) + "원 입니다.");// 요금 계산
		} else {
			System.out.println("차량이 입고된 기록이 없습니다.");
		}
	}
}