package by.epam.homework04;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] massive = new int[random.nextInt(5)];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(100);
		}
		
		int count = 0;
		
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % 2 == 0) {
				count++;
			}
		}
		
		if (count > 0) {
			int[] evenMassive = new int[count];
			
			for (int i = 0, j = 0; i < massive.length; i++) {
				
				if (massive[i] % 2 == 0) {
					evenMassive[j++] = massive[i];
				}
			}
		}
		else {
			System.out.println("No even numbers!");
		}
	}

}
