package org.snack2.java;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		String[] firstNames = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		
		String[] lastNames = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		Random rnd = new Random();
		
		int rndFirstName = rnd.nextInt(firstNames.length);
		
		int rndLastName = rnd.nextInt(lastNames.length);
		
		System.out.println(firstNames[rndFirstName] + " " + lastNames[rndLastName]);
	}
}
