package sortModel;

import sortController.Controller;

public class SelectionSort implements Sort {
	static int arrayAcc = 0;
	static int comp = 0;

	public static void sort(Controller ctrl, int[] a, int low, int high) {
		int minIndex;

		for (int i = 0; i < a.length - 1; i++) {
			minIndex = getMin(ctrl, a, i);
			swap(a, i, minIndex);
		}
	}

	private static int getMin(Controller ctrl, int[] a, int i) {
		int minIndex = i;
		for (int j = i + 1; j < a.length; j++) {
			ctrl.setLabel("\"Selection Sort\" \t ,Comparisons: " + ++comp + " ,arry access: " + arrayAcc);
			ctrl.setArray(i, j, a);
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			arrayAcc += 2;
			if (a[j] < a[minIndex])
				minIndex = j;
		}
		return minIndex;
	}

	private static void swap(int[] a, int source, int distination) {

		arrayAcc += 3;
		int temp = a[distination];
		a[distination] = a[source];
		a[source] = temp;
	}
}
