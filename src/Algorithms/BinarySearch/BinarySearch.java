/*
 * Author : AdNovum Informatik AG
 */

package Algorithms.BinarySearch;

public class BinarySearch {

	public static int bsFirst(int[] a, int left, int right, int x) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if ((mid == left || x > a[mid - 1]) && a[mid] == x) {
				return mid;
			}
			else if (x > a[mid]) {
				return bsFirst(a, (mid + 1), right, x);
			}
			else {
				return bsFirst(a, left, (mid - 1), x);
			}
		}
		return -1;
	}

	public static int bsLast(int[] a, int left, int right, int x) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if ( (mid == right || x < a[mid + 1]) && a[mid] == x) {
				return mid;
			} else if (x < a[mid]) {
				return bsLast(a, left, mid - 1, x);
			} else {
				return bsLast(a, mid + 1, right, x);
			}
		}
		return -1;
	}
}
