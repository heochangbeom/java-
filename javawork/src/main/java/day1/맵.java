package day1;

import java.util.HashSet;
import java.util.Set;

public class 맵 {
	public static void main(String[] args) {
		Set<Integer> list = new HashSet<Integer>();

		while (list.size() < 6) {
			int lotto = (int) (Math.random() * 20) + 1;

			list.add(lotto);

		}

		System.out.println(list);
	}// main
}// class
