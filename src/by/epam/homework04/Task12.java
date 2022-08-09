package by.epam.homework04;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		double[] massive = new double[random.nextInt(99)+1];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextDouble(100.0);
		}
		
		double sum = 0;
		
		for (int n = 2; n < massive.length; n++) {
			
			int j = 0;
			
			for (int i = 2; i*i <= n && j != 1; i++) {
				
				if (n % i == 0) {
					j = 1;
				}
			}
			
			if (j == 0) {
				sum += massive[n];
			}
			
		}
		
		System.out.println(sum);
		
	}

}
