package com.yash;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test test = new test();
//		List<Integer> list = test.CreateFibonacci(7);
//		System.out.println(list.toString());
		int count=1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

	public static List<Integer> CreateFibonacci(int seriesLength) {
		List<Integer> list = new ArrayList<Integer>();
		int n1 = 0, n2 = 1, n3;
		list.add(0);
		list.add(1);
		for (int i = 2; i < seriesLength; i++) {
			n3 = n1 + n2;
			list.add(n3);
			n1 = n2;
			n2 = n3;
		}
		return list;
	}

}
