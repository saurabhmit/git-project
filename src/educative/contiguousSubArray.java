package educative;

import java.util.Arrays;

public class contiguousSubArray {
	public static double[] findAverage(int k, int[] arr) {
		double[] result = new double[arr.length + 1];
		for (int i = 0; i <= arr.length - k; i++) {
			double sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + arr[j];
				result[i] = sum / k;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contiguousSubArray cs = new contiguousSubArray();
		cs.findAverage(5, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		System.out.println(Arrays.toString(result));

	}

}
