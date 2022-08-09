package by.epam.homework04;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] massive = new int[random.nextInt(100)];
		
		for(int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(100);
		}
		
		int m = random.nextInt(8) + 2;
		int l = random.nextInt(m - 2) + 1;
		System.out.println("M = " + m);
		System.out.println("L = " + l);
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] % m == l) {
				System.out.printf("[%3d]", massive[i]);
			}
		}
		
	}

}
