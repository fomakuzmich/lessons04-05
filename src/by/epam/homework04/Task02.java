package by.epam.homework04;

public class Task02 {

	public static void main(String[] args) {
		
		int[] massive = {10, 15, 124, 0, 20, 0, 458, 65893, 0, -45, 56, 0};
		int[] zeroIndexMassive = null;
		
		for (int i = 0, j = 0; i < massive.length; i++) {
			if (massive[i] == 0) {
				j++;
			}
			if (i == massive.length - 1) {
				zeroIndexMassive = new int[j];
			}
		}
		
		for (int i = 0, j = 0; i < massive.length; i++) {
			if (massive[i] == 0) {
				zeroIndexMassive[j++] = i;
			}
		}
		
		for (int x : zeroIndexMassive) {
			System.out.println(x);
		}
	}

}
