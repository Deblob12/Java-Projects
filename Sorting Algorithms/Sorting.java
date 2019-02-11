import java.util.*;

public class Sorting {
	public static ArrayList<Double> SelectionSort(ArrayList<Double> nums) {
		int length = nums.size();
		if (length == 0) {
			return nums;
		}
		ArrayList<Double> dummy = new ArrayList<Double>(nums);
		int min = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (dummy.get(j) < dummy.get(min)) {
					min = j;
				}
			}
			swap(dummy, i, min);
			min = i + 1;
		}
		return dummy;
	}

	public static ArrayList<Double> QuickSort(ArrayList<Double> nums, int low, int high) {
		ArrayList<Double> dummy = new ArrayList<Double>(nums);
		double pivot = dummy.get((low + high) / 2);
		if (low < high) {
			int pi = partition(dummy, low, high, pivot);
			dummy = QuickSort(dummy, low, pi - 1);
			dummy = QuickSort(dummy, pi, high);
		}

		return dummy;
	}

	private static int partition(ArrayList<Double> nums, int low, int high, double pivot) {
		while (low <= high) {
			while (nums.get(low) < pivot) {
				low++;
			}
			while (nums.get(high) > pivot) {
				high--;
			}
			if (low <= high) {
				swap(nums, low, high);
				low++;
				high--;
			}
		}
		return low;
	}

	public static ArrayList<Double> InsertionSort(ArrayList<Double> nums) {
		int length = nums.size();
		if (length == 0) {
			return nums;
		}
		ArrayList<Double> dummy = new ArrayList<Double>(nums);
		for (int i = 1; i < length; i++) {
			double value = dummy.get(i);
			int j = i - 1;
			while (j >= 0 && dummy.get(j) > value) {
				swap(dummy, i, j);
				i--;
				value = dummy.get(i);
				j--;
			}
		}
		return dummy;
	}

	public static ArrayList<Double> BubbleSort(ArrayList<Double> nums) {
		int length = nums.size();
		ArrayList<Double> dummy = new ArrayList<Double>(nums);
		boolean swapped = false;
		while (true) {
			for (int i = 0, j = i + 1; j < length; i++, j++) {
				if (dummy.get(j) < dummy.get(i)) {
					swap(dummy, i, j);
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
			swapped = false;
		}
		return dummy;
	}

	public static ArrayList<Double> MergeSort(ArrayList<Double> nums, int low, int high) {
		ArrayList<Double> returnArr = new ArrayList<Double>(nums);
		ArrayList<Double> left = new ArrayList<Double>();
		ArrayList<Double> right = new ArrayList<Double>();
		if (low == high) {
			return returnArr;
		}
		else if (low < high) {
			int m = (low + high) / 2;
			for (int i = 0; i <= m; i ++) {
				left.add(returnArr.get(i));
			}
			for (int j = m + 1; j < returnArr.size(); j++) {
				right.add(returnArr.get(j));
			}
			left = MergeSort(left, 0, m);
			right = MergeSort(right, 0, returnArr.size()- 2 - m);
			returnArr = Merge(left, right);
		}
		return returnArr;

	}

	private static ArrayList<Double> Merge(ArrayList<Double> l, ArrayList<Double> r) {
		ArrayList<Double> returnArr = new ArrayList<Double>();
		int i = 0;
		int j = 0;
		boolean lbreak = false;
		boolean rbreak = false;
		while (!lbreak || !rbreak) {
			if (!lbreak) {
				if (rbreak) {
					returnArr.add(l.get(i));
					i++;
				}
				else if (l.get(i) <= r.get(j)) {
					returnArr.add(l.get(i));
					i++;
				}
				if (i == l.size()) {
					lbreak = true;
				}
			}
			if (!rbreak) {
				if (lbreak) {
					returnArr.add(r.get(j));
					j++;
				}
				else if (l.get(i) > r.get(j)) {
					returnArr.add(r.get(j));
					j++;
				}
				if (j == r.size()) {
					rbreak = true;
				}
			}
		}

		return returnArr;
	}



	public static void swap(ArrayList<Double> nums, int index1, int index2) {
		double temp = nums.get(index1);
		nums.set(index1, nums.get(index2));
		nums.set(index2, temp);
	}
	
}