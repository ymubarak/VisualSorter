package sortModel;

import sortController.Controller;

public class BubbleSort implements Sort {

	static int arrAcc = 0;

	public static void sort(Controller ctrl, int[] a, int low, int high) {

		boolean swapped = true;
		int comp = 0;
		for (int i = 0; i < a.length && swapped; i++) {
			swapped = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				ctrl.setLabel("\"Bubble Sort\" \t ,Comparisons: " + ++comp + " ,arry access: " + (arrAcc + 2));
				if (a[j] > a[j + 1]) {
					swap(a, (j + 1), j);
					ctrl.setArray(j + 1, j, a);
					try {
						Thread.sleep(50);
					} catch (InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
					swapped = true;
				}
			}
		}
	}

	private static void swap(int[] a, int source, int distination) {

		arrAcc += 3;
		int temp = a[distination];
		a[distination] = a[source];
		a[source] = temp;
	}
}
