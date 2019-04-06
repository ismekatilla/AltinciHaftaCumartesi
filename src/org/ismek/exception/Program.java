package org.ismek.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		try {
			int sayi = scanner.nextInt();
			bol(sayi);
			System.out.println(sayi);
		} catch (MyException | ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
		scanner.close();

	}

	private static void bol(int sayi) throws MyException {
//		if (sayi == 0) {
//			throw new MyException("0001", "Sayı 0 olamaz");
//		}
		
		try {
			int aaa = 5 / sayi;
		} catch (ArithmeticException e) {
			throw new MyException("0001", "Sayı 0 olamaz");
		}
	}
}
