package by.epam.homework04;

import java.util.Random;

public class Task13 extends MassiveOperations {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] massive = new int[random.nextInt(99) + 1];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(100);
		}
		
		int m = 5;
		int l = 20;
		int n = 50;
		int count = 0;
		printMassive(massive);
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] % m == 0 && massive[i] >= 20 && massive[i] <= n) {
				count++;
			}
		}
		
		System.out.println(count + " elements");
		
	}

}
