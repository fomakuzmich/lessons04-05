package by.epam.homework04;

public class Task16 extends MassiveOperations{

	public static void main(String[] args) {
		
		int n = 10;
		
		int[] massive = generateNewMassive(n * 2);
		
		int max = massive[0] + massive[massive.length - 1];
		
		for (int i = 0, j = massive.length - 1; i < n; i++, j--) {
			
			if (massive[i] + massive[j] > max) {
				max = massive[i] + massive[j];
			}
		}
		
		printMassive(massive);
		System.out.println(max);
		
	}

}
