package sortModel;

import sortController.Controller;

public class ShellSort {

	public static void shellSort(Controller ctrl, int[] a, int low, int high) {

		int gap = a.length / 2;
		while (gap > 0) {
			for (int j = gap; j < a.length; j++) {
				for (int i = j - gap; i >= 0; i = i - gap)
					if (a[i] > a[i + gap]) {
						swap(a, i, i + gap);
						ctrl.setArray(i, i + gap, a);
						try {
							Thread.sleep(300);
						} catch (InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					} else
						break;

			}
			gap = gap / 2;
		}
	}

	private static void swap(int[] a, int source, int distination) {

		int temp = a[distination];
		a[distination] = a[source];
		a[source] = temp;
	}

}
