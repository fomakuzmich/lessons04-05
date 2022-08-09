package by.epam.homework04;

import java.util.Random;

public class Task15 extends MassiveOperations{

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int c = random.nextInt(200) - 100;
		int d = c + random.nextInt(20);
		
		int[] massive = generateNewRandomMassive();
		
		System.out.println("from " + c + " to " + d);
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] >= c && massive[i] <= d) {
			System.out.printf("[%4d] ", massive[i]);
			}
		}
		
		System.out.println("");
	}

}
