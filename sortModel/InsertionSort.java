package sortModel;

import sortController.Controller;

public class InsertionSort implements Sort {

	public static void sort(Controller ctrl, int[] a, int low, int high) {
		int arrayAcc = 0;
		int comp = 0;
		for (int i = 0; i < a.length; i++) {
			int pos = i;
			int inserted = a[pos];
			arrayAcc++;
			ctrl.setArray(pos, -1, a);
			while (pos > 0 && inserted < a[pos - 1]) {
				a[pos] = a[pos - 1];
				arrayAcc += 3;
				comp++;
				pos--;
				try {
					Thread.sleep(50);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				ctrl.setArray(-1, pos, a);
				ctrl.setLabel("\"Insertion Sort\" \t ,Comparisons: " + comp + " ,arry access: " + arrayAcc);
			}
			a[pos] = inserted;
			arrayAcc++;
		}
	}
}
