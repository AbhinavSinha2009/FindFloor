public class Main {

	public static void main(String[] args) {
		int[] arr = {-2000, -500, 0, 449, 999, 1789, 2100, 3250};
		System.out.println(findFloor(arr, 389));
		System.out.println(findFloor(arr, -752));
		System.out.println(findFloor(arr, 3276));
	}
	//implements binary search, so O(log n)
	public static int findFloor(int[] arr, int target) { //in sorted arr returns greatest num <= than target
		if (target < arr[0]) { //if no num is greater target
			return -1;
		}
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2; //do this instead of: (start+end)/2 bc start+end may exceed max int val
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return arr[mid]; //if mid==target return arr[mid]
			}
		}
		return arr[end]; 
		//bc when while loop is broken, the end val is the greatest num which is less than the start val
	}
}
