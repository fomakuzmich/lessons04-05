package by.epam.homework04;

public class Task14 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewRandomMassive();
		int evenMax = massive[0];
		int oddMin = massive[1];
		int sum = evenMax + oddMin;
				
		for (int i = 0; i < massive.length; i++) {
			
			if (i % 2 == 0) {
				
				if (massive[i] > evenMax) {
					evenMax = massive[i];
				}
			}
			else {
				
				if (massive[i] < oddMin) {
					oddMin = massive[i];
				}
			}
		}
		
		printMassive(massive);
		System.out.println(sum);
			
	}

}
