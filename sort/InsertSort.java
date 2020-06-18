import java.util.Arrays;

public class InsertSort {

	static void sort(int[] arr) {

		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1; //sempre movimenta o para posição anterior
			while (i >= 0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int [] {9,8,7,6,1,2,5,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

