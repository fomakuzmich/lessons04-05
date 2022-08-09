package by.epam.homework04;

import java.util.Random;

public class MassiveOperations {
	
	public static int[] generateNewRandomMassive() {
		
		Random random = new Random();
		
		int[] massive = new int[random.nextInt(97)+3];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(200) - 100;
		}
		
		return massive;
	}
	
	public static int[] generateNewMassive(int n) {
		
		Random random = new Random();
		
		int[] massive = new int[n];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(200) - 100;
		}
		
		return massive;
	}
	
	public static void printMassive(int[] massive) {
		
		for (int i = 0; i < massive.length - 1; i++) {
			System.out.printf("[%4d], ", massive[i]);
		}
		
		System.out.printf("[%4d]\n", massive[massive.length-1]);
	}

}
