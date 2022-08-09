package by.epam.homework04;

public class Task08 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewRandomMassive();
		int negative = 0;
		int positive = 0;
		int zero = 0;
		
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] < 0) {
				negative++;
			}
			else if (massive[i] > 0) {
				positive++;
			}
			else {
				zero++;
			}
		}
		
		printMassive(massive);
		System.out.println("Zero numbers " + zero);
		System.out.println("Positive numbers " + positive);
		System.out.println("Negative numbers " + negative);
	}

}
