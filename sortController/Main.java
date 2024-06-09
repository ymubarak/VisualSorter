package sortController;

import sortModel.BubbleSort;
import sortModel.Heap;
import sortModel.HeapSort;
import sortModel.InsertionSort;
import sortModel.QuickSort;
import sortModel.SelectionSort;
import sortModel.ShellSort;
import sortView.MainFrame;

public class Main {
	public static void main(String[] args) {

		int[] unsortedArray = { 2, 8, 4, 6, 9, 7, 10, 35, 14, 11, 0, 16, 20, 15, 13, 21, 25, 1, 19, 3, 12, 5, 27, 27,
				30, 29, 17, 26, 30, 34, 33, 32, 40, 38, 37, 36, 35, 42, 43, 41, 50, 55, 52, 49, 53, 44, 67, 24, 65, 51,
				46, 45, 44, 64, 62, 70, 68 };
		new MainFrame();
		// PlayAudio p = new PlayAudio();
		// p.playAudio();
		Controller ctrl = new Controller();
		ctrl.setArray(-1, -1, unsortedArray);
		// BubbleSort.sort(ctrl, unsortedArray, 0, unsortedArray.length - 1);
		// SelectionSort.sort(ctrl, unsortedArray, 0, unsortedArray.length - 1);
		// InsertionSort.sort(ctrl, unsortedArray, 0, unsortedArray.length - 1);
		// ShellSort.shellSort(ctrl, unsortedArray, 0, unsortedArray.length -
		// 1);
		// QuickSort.sort(ctrl, unsortedArray, 0, unsortedArray.length - 1);
		HeapSort.sort(ctrl, unsortedArray);

		// print ourput......
		for (int i = 0; i < unsortedArray.length; i++) {
			ctrl.setArray(-1, -1, unsortedArray);
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
