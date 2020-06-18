import java.util.*;

public class InsertSort {

	static void sort(int[] arr) {

		for (int j = 1; j < arr.length; j++) {
			int currentElement = arr[j];
			int pivot = j - 1;
			int previousElement =  arr[pivot];
			while (pivot >= 0 && previousElement > currentElement) {
				arr[pivot+1] = arr[pivot];
				pivot--;
			}
			arr[pivot+1] = currentElement;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int [] {3,9,8,7,6,5,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

