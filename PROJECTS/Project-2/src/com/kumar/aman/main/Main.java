package com.kumar.aman.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.kumar.aman.action.Action;

public class Main {
	public static void main(String[] args) {
		Action action = new Action();
		lp: while (true) {
			System.out.println("1 - Insert Data for Student");
			System.out.println("2 - Insert Data for Teacher");
			System.out.println("3 - Display Data for Student");
			System.out.println("4 - Display Data for Teacher");
			System.out.println("5 - End Program");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter a Key : ");
			try {
				int key = Integer.parseInt(bufferedReader.readLine());
				switch (key) {
				case 1:
					action.addStudent();
					System.out.println("---------------------------\n");
					break;
				case 2:
					action.addTeacher();
					System.out.println("---------------------------\n");
					break;
				case 3:
					action.getStudent();
					System.out.println("---------------------------\n");
					break;
				case 4:
					action.getTeacher();
					System.out.println("---------------------------\n");
					break;
				case 5:
					System.out.println("---------------------------\n");
					break lp;
				default:
					System.out.println("Wrong key");
					System.out.println("---------------------------\n");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
