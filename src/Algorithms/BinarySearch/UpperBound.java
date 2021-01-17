/*
 * Author : AdNovum Informatik AG
 */

package Algorithms.BinarySearch;

public class UpperBound {
	public static int upper_bound(int[] a, int left, int right, int x) {
		int pos = right;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] > x) {
				pos = mid;
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return pos;
	}
}
