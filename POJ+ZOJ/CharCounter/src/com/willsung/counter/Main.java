package com.willsung.counter;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int numChar = 0; 
		int numSpace = 0;
		int numNum = 0;
		int NumOther = 0;
		for (int i = 0; i < string.length(); i++) {
			char s = string.charAt(i);
			if (Character.isLetter(s)) {
				numChar++;
			}else if (Character.isSpaceChar(s)) {
				numSpace++;
			}else if (Character.isDigit(s)) {
				numNum++;
			}else {
				NumOther++;
			}
		}
		System.out.println(numChar);
		System.out.println(numSpace);
		System.out.println(numNum);
		System.out.println(NumOther);
	}
}
