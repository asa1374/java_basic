package day1;
import java.util.Scanner;
public class WhatName {
	public static void main(String[] args) {
		System.out.println("이름이 무엇입니까?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println(name + "입니다.");
	}
}
