import java.util.*;

public class SortingClient {
	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<Double>();
		double d;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Number: ");
			d = scan.nextDouble();
			nums.add(d);
		}

		long startTime = System.currentTimeMillis();
		System.out.println(Sorting.BubbleSort(nums));
		System.out.println(System.currentTimeMillis() - startTime);
		startTime = System.currentTimeMillis();
		System.out.println(Sorting.SelectionSort(nums));
		System.out.println(System.currentTimeMillis() - startTime);
		startTime = System.currentTimeMillis();
		System.out.println(Sorting.MergeSort(nums, 0, nums.size() - 1));
		System.out.println(System.currentTimeMillis() - startTime);
		startTime = System.currentTimeMillis();
		System.out.println(Sorting.QuickSort(nums, 0, nums.size() - 1));
		System.out.println(System.currentTimeMillis() - startTime);
		startTime = System.currentTimeMillis();
		System.out.println(Sorting.InsertionSort(nums));
		System.out.println(System.currentTimeMillis() - startTime);

	}
}