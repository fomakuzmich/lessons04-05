package by.epam.homework04;

public class Task10 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewRandomMassive();
		
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] > i) {
				System.out.printf("[%2d]", massive[i]);
			}
		}
	}

}
