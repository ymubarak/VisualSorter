package sortModel;

import sortController.Controller;

public class QuickSort implements Sort {

	public static void sort(Controller ctrl, int[] a, int low, int high) {

		if (low < high) {
			int wall = low;
			int l = low;
			int pivot = a[high];
			while (l < high) {
				if (a[l] < pivot && l < high) {
					if (a[l] != a[wall])
						swap(a, l, wall);
					wall++;
					ctrl.setArray(wall, l, a);
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				}
				l++;
			}
			swap(a, high, wall);

			sort(ctrl, a, low, wall - 1);
			sort(ctrl, a, wall + 1, high);
		}
	}

	private static void swap(int[] a, int ToBeMoved, int front) {

		int temp = a[front];
		a[front] = a[ToBeMoved];
		a[ToBeMoved] = temp;
	}
}
