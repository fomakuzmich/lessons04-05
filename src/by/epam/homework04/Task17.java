package by.epam.homework04;

public class Task17 extends MassiveOperations{

	public static void main(String[] args) {

		int[] massive = generateNewMassive(1000);
		int min = massive[0];
		int count = 1;
		
		printMassive(massive);
		
		for (int i = 1; i < massive.length; i++) {
			
			if (massive[i] == min) {
				count++;
			}
			else if (massive[i] < min) {
				min = massive[i];
				count = 1;
			}
		}
		
		int[] newMassive = new int[massive.length - count];
		
		for (int i = 0, j = 0; i < massive.length; i++) {
			
			if (massive[i] != min) {
				newMassive[j++] = massive[i];
			}
		}
		
		printMassive(newMassive);
		
	}

}
