package by.epam.homework04;

public class InsertionSort extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewMassive(15);
		printMassive(massive);
		
		// ascending sort:
		for (int i = 1; i < massive.length; i++) {
			
			for (int j = 0; j < i; j++) {
				
				if (massive[i] < massive[j]) {
					int x = massive[i];
					
					for (int n = i; n > j; n--) {
						massive[n] = massive[n - 1];
					}
					massive[j] = x;
				}
			}
		}
		printMassive(massive);
		
		// descending sort:
		for (int i = 1; i < massive.length; i++) {
			
			for (int j = 0; j < i; j++) {
				
				if (massive[i] > massive[j]) {
					int x = massive[i];
					
					for (int n = i; n > j; n--) {
						massive[n] = massive[n - 1];
					}
					massive[j] = x;
				}
			}
		}
		printMassive(massive);
	}

}
