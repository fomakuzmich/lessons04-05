package by.epam.homework04;

public class Task19 extends MassiveOperations{

	public static void main(String[] args) {
		
		int[] massive = generateNewMassive(100);
		int count = 0;
		int answer = massive[0];
		
		for (int i = 0; i < massive.length; i++) {
			
			int secondCount = 0;
			
			for (int j = 0; j < massive.length; j++) {
				
				if (massive[i] == massive[j]) {
					secondCount++;
				}
			}
			if (secondCount > count) {
				count = secondCount;
				answer = massive[i];
			}
			else if (secondCount == count) {
				answer = Math.min(answer, massive[i]);
			}
		}
		printMassive(massive);
		System.out.println(answer + " meets " + count + " times");
	}

}
