package Collection;

public class ArrayMax {

	public static void main(String[] args) {

		int[] abc = { 1, 25, 15, 654, 4 };
		int max = Integer.MIN_VALUE;
		for (int elemenet : abc) {
			if (elemenet > max) {
				max = elemenet;

			}
		}
		System.out.println("Max value:" + max);
	}
}
