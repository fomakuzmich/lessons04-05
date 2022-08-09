package by.epam.homework04;

import java.util.Random;

public class Task07 extends MassiveOperations{

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] massive = generateNewRandomMassive();
		int z = random.nextInt(100);
		int count = 0;
		
		printMassive(massive);
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] > z) {
				massive[i] = z;
				count++;
			}
		}
		
		System.out.println("Z = " + z);
		System.out.println("Number of substitutions " + count);
		printMassive(massive);
	}

}
