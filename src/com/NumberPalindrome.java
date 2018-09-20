package com;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		String orginal = sc.nextLine();
		for (int i = orginal.length() - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		if (orginal.equals(reverse)) {
			System.out.println("palindrome");}
			else{
				System.out.println("not palindrome");
			}
		}
	}

