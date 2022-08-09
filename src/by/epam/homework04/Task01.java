package by.epam.homework04;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] a = new int[random.nextInt(100)];
		int k = random.nextInt(10);
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = random.nextInt(1000);
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		
		System.out.println(sum);
	}

}
