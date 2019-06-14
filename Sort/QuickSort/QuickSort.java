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
	//һ��������Partition����
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
	//����inputʲô����
	//right����Ҫpartition��Χ���ұ߽�index��left�Ƿ�Χ��߽�index

	int pivot = rightside;
	int left = leftside;
	int right = rightside -1;

	//�趨����2�鵲��i,j
	int i = left;
	int j = right;

	//�ƶ�����Ĺ���

	while(j >= i){      //Ϊʲô��"����" ��Ϊ��ǰ���index=i=j����δ̽��
	   if(array[i] < array[pivot]){
	    i++;
	   }else if(array[j] >= array[pivot]){
	   j--;
	   }else {
	      swap(array, i, j);
	   }
		
	//����ѭ�����õ�����λ��

	swap(array, i, pivot);
	return i;

	}


	}	

}
