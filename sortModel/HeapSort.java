package sortModel;

import sortController.Controller;

public class HeapSort {

	static Heap heap;

	public static void sort(Controller ctrl, int[] unsortedArray) {
		heap = new Heap(unsortedArray.length);
		try {
			Thread.sleep(600);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		heap.build_max_heap(unsortedArray);
		ctrl.setArray(0, unsortedArray.length - 1, unsortedArray);
		try {
			Thread.sleep(300);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		for (int i = unsortedArray.length - 1; i > 0; i--) {
			heap.swap(unsortedArray, 0, i);
			heap.length--;
			heap.max_heapify(0);
			ctrl.setArray(0, i, unsortedArray);
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
