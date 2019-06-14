package quicksort;

import java.util.Arrays;

class Test{
	public static void main(String[] args){
		QuickSort sol = new QuickSort();
		int[] array = null;
		array = sol.quickSort(array);
		System.out.println(Arrays.toString(array));
		
		array = new int[0];
		array = sol.quickSort(array);
		System.out.println(Arrays.toString(array));
		
	}	
}

private void swap(int[] array,int left,int right){
	int temp = array[left];
	array[left] = array[right];
	array[right] = temp;

public class QuickSort {
	//一个完整的Partition过程
	public int[] quickSort(int[] array){
		//check null first.
		if(array == null){
			return array;
		}
		quickSort(array, 0, array.length-1);
		return array;
	}
	
	public void quickSort(int[] array,int left,int right){
		if(left >= right){
			return;
		}
		int pivot = partition(array,left,right);
		quickSort(array,left,pivot - 1);
		quickSort(array,pivot + 1,right);
	}
	
	private int partition(int[] array, int leftside, int rightside){		
	//这里input什么？？
	//right是需要partition范围的右边界index，left是范围左边界index

	int pivot = rightside;
	int left = leftside;
	int right = rightside -1;

	//设定左右2块挡板i,j
	int i = left;
	int j = right;

	//移动挡板的过程

	while(j >= i){      //为什么有"等于" 因为当前这个index=i=j处还未探索
	   if(array[i] < array[pivot]){
	    i++;
	   }else if(array[j] >= array[pivot]){
	   j--;
	   }else {
	      swap(array, i, j);
	   }
		
	//跳出循环，得到挡板位置

	swap(array, i, pivot);
	return i;

	}


	}	

}
