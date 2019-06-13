package binarysearch;

public class SolutionBinary2 {
	int search(int[] array, int target, int left, int right){
		if(array == null|| array.length == 0|| left > right){
			return -1;
		}
		int mid = left + (right - left)/2;
		if(target < array[mid]){
			return search(array, target, left, mid - 1);
		}else if(target > array[mid]){
			return search(array, target, left+1, right);
		}else{
			return mid;
		}
	}

}
