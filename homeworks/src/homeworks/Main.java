package homeworks;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// **************** Ödev1 ***************************************
		Random random = new Random();
		int columnCount = 5;
		int lottery[][] = new int[columnCount][6];

		for (int i = 0; i < columnCount; i++) {
			for (int j = 0; j < 6; j++) {
				int number = random.nextInt(49);
				if (number != lottery[i][j]) {
					lottery[i][j] = number;
				}
			}
		}
		for (int i = 0; i < columnCount; i++) {
			System.out.println("*******" + (i + 1) + ". Kolon**********");
			for (int j = 0; j < 6; j++) {
				System.out.println(lottery[i][j]);
			}
		}

		// *************** Ödev2 ****************************************
		int[] numbers = { 5, 5, 7, 6, 7, 5, 4, 9, 7 };
		int[] distinctNumbers = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			boolean repeated = false;
			int number = numbers[i];

			for (int j = 0; j < numbers.length; j++) {
				if (distinctNumbers[j] == number) {
					repeated = true;
					break;
				}
			}
			if (repeated == false) {
				distinctNumbers[i] = number;
			}
		}
		for (int distinctNumber : distinctNumbers) {
			System.out.println(distinctNumber);
		}
		// **************************************************************

		// ********************* Ödev3 ***********************************
		int[] unsortedNumbers = { 7, 8, 2, 11, 23, 1, 4 };
		int[] sortedNumbers = new int[unsortedNumbers.length];
		int maxNumber = unsortedNumbers[0];
		int minNumber = unsortedNumbers[0];

		for (int i = 0; i < unsortedNumbers.length; i++) {
			if (unsortedNumbers[i] > maxNumber) {
				maxNumber = unsortedNumbers[i];
			}

			if (unsortedNumbers[i] < minNumber) {
				minNumber = unsortedNumbers[i];
			}

		}

		int index = 0;
		for (int i = maxNumber; i >= minNumber; i--) {
			int control = 0;
			for (int number : unsortedNumbers) {
				if (number == i) {
					control = i;
					break;
				}
			}
			if (control != 0) {
				sortedNumbers[index] = control;
				index++;
			}
		}

		for (int sortedNumber : sortedNumbers) {
			System.out.println(sortedNumber);
		}
		// ****************************************************************
	}

}
