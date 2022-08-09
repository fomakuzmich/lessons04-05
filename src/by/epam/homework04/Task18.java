package by.epam.homework04;

public class Task18 extends MassiveOperations{

	public static void main(String[] args) {

		int[] key = new int[10];
		key[0] = 4;
		key[5] = 1;
		
		for (int i = 0; i < key.length - 3; i++) {
			if (key[i] > 0) {
				key[i + 3] = key[i];
			}
		}
		
		for (int i = key.length - 1; i > 2; i--) {
			if (key[i] > 0) {
				key[i - 3] = key[i];
			}
		}
		
		for (int i = 0; i < key.length; i++) {
			if (i < key.length-2) {
				if (key[i] == 0) {
					key[i] = 10 - (key[i] + key[i + 1] + key[i + 2]);
				}
			}
			else {
				if (key[i] == 0) {
					key[i] = 10 - (key[i] + key[i - 1] + key[i - 2]);
				}
			}
		}
		printMassive(key);
		
	}

}
