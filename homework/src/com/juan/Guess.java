package com.juan;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number (1-100)：");
		int guess = scan.nextInt();
		int secret = 60;
		if(guess > secret) {
			System.out.println("Smaller, secret number between " + guess + " > secret number");
		}else if(guess < secret) {
			System.out.println("Bigger, secret number between " + guess + " < secret number");
		}else {
			System.out.println("Bingo！");
		}
	}

}
