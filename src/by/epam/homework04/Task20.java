package by.epam.homework04;

public class Task20 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewMassive(20);
		printMassive(massive);
		int count = 0;
		
		for (int i = 0, j = 0; j < massive.length; i++, j++) {
			if (i % 2 != 0) {
				massive[i] = massive[j++];
				count++;
			}
			else {
				massive[i] = massive[j++];
			}
		}
			
		for (int i = massive.length / 2 + massive.length % 2; i < massive.length; i++) {
			massive[i] = 0;
		}
		printMassive(massive);
		
	}

}
