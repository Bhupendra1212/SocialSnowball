package allPrograms;

public class countOddAndEvenNumInArray {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		int count1 = 0;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] % 2 == 0) {
				count++;
			} else {
				count1++;
			}

		}
		System.out.println("Even number:-" + count);
		System.out.println("Odd number:-" + count1);

	}

}
