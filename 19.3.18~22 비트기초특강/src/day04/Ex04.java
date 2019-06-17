package day04;

import java.util.ArrayList;

public class Ex04 {
 public static void main(String[] args) {
	 ArrayList<Integer> arr= new ArrayList<Integer>();
	 arr.add(1);
	 arr.add(3);
	 arr.add(2);
	 arr.add(4);
	 System.out.println(arr.indexOf(3));
	 System.out.println(arr.size());
	 System.out.println(arr.get(2));
	 day03.Ex01 ex = new day03.Ex01();
	 ex.main(args);
 }
}
