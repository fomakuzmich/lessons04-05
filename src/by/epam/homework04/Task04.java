package by.epam.homework04;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] massive = new int[3];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(10);
		}
		
		int count = 1;
		
		for (int i = 1; i < massive.length; i++) {
			if (massive[i] > massive[i-1]) {
				count++;
				if (count == massive.length) {
					System.out.println("ascending sequence");
				}
			}
			else {
				System.out.println("non-increasing sequence");
				break;
			}
		}
		
	}

}
