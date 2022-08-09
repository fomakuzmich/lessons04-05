package by.epam.homework04;

public class Task09 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewRandomMassive();
		
		int min = massive[0];
		int minIndex = 0;
		int max = massive[0];
		int maxIndex = 0;
		
		for (int i = 1; i < massive.length; i++) {
			
			if (massive[i] < min) {
				min = massive[i];
				minIndex = i;
			}
			if (massive[i] > max) {
				max = massive[i];
				maxIndex = i;
			}
		}
		printMassive(massive);
		massive[minIndex] = max;
		massive[maxIndex] = min;
		printMassive(massive);
	}

}
