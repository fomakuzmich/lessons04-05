package by.epam.homework04;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] massive = new int[random.nextInt(100)];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(100)-50;
		}
		
		if (massive[0] < 0) {
			System.out.println("negative number occur before");
		}
		else {
			System.out.println("positive number occur before");
		}
	}

}
