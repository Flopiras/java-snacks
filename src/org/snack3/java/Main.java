package org.snack3.java;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] numbers = new int[10];
		for (int x=0;x<numbers.length;x++) {
			
			numbers[x] = rnd.nextInt(0, 11);
			System.out.println("number[" + x + "]: " + numbers[x]);
		}
		
		int sum = 0;
		
		for(int x = 0; x < numbers.length; x = x+2) {
			
			System.out.println("sumNumber[" + x + "]: " + numbers[x]);
			sum += numbers[x];
		}
		
		System.out.println(sum);
		
		
	}
}
