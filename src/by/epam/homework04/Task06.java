package by.epam.homework04;

public class Task06 extends MassiveOperations{

	public static void main(String[] args) {
		int[] massive = generateNewRandomMassive();
		
		printMassive(massive);
		
		int min = massive[0];
		int max = massive[0];
		
		for (int i = 1; i < massive.length; i++) {
			
			if (massive[i] < min) {
				min = massive[i];
			}
			if (massive[i] > max) {
				max = massive[i];
			}
		}
		
		int count = 0;
		
		for (int i = min; i < max; i++) {
			
			count++;
		}
		
		System.out.println(count);
	}

}
