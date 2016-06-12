package cn1.sort;

import java.awt.Component;
import java.awt.List;

import datastructure.list.ArrayList;

public class SortTest {
	public static void main(String[] args) {
		radixSort();
	}

	/**
	 * 直接插入排序 ， 每步将一个待排序记录，按其顺序码插入到前面已经 排序的字序列的合适位置
	 * 
	 * @return void
	 */
	public static void f1() {
		int[] testArray = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		int n = testArray.length;
		int temp, j;
		for (int i = 1; i < n; i++) {
			temp = testArray[i];
			for (j = i - 1; j >= 0; j--) {
				if (testArray[j] > temp) {
					testArray[j+1] = testArray[j];					
				} else {
					break;
				}
			}
			testArray[j + 1] = temp;
		}
		printArray(testArray);
	}
	/** 
	*希尔排序
	*把待排序的数据元素分成若干个小组面对同一小组内的数据元素进行直接插入法排序，小组
	*的有个数主次缩小，完成了所有数据元素都在一个组内的排序后排序过程结束。  
	* @return void 
	*/
	public static void f2() {
		int[] testArray = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		int n = testArray.length;
		int d = n;
		int temp, k;
		while (true) {
			d = d/2;
			for(int i = 0; i < d; i++) {
				for(int j = i + d; j < n; j = j + d) {
					temp = testArray[j];
					for(k = j - d; k >= 0 && testArray[k] > temp; k = k - d) {
						testArray[k + d] = testArray[k];
					}
					testArray[k + d] = temp; 
				}
			}
			if(d == 1) {
				break;
			}
		}
		printArray(testArray);
	}
	
	/** 
	* 简单选择排序
	* 在要排序的一组数中，选出最小的一个数与第一个位置的数交换
	* 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环，
	* 直到倒数第二个与最后一个交换为止   
	* @return void 
	*/
	public static void f3() {
		int[] testArray = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		int n = testArray.length;
		int k ,temp;
		for(int i = 0;  i < n - 1; i++) {
			k = i;
			temp = testArray[k];
			for(int j = i + 1; j < n; j++) {
				if(testArray[j] < testArray[k]) {
					temp = testArray[j];
					k = j;
				}
			}
			if(k != i) {
				temp = testArray[k];
				testArray[k] = testArray[i];
				testArray[i] = temp;
			}
		}
		printArray(testArray);
	}
	
	public static void createHeap(int[] testArray, int n, int h) {
		int j = 2 * h + 1;
		int i = h;
		int temp = testArray[i];
		boolean flag = false;
		while(j < n &&  !flag) {
			if(j < n - 1 && testArray[j] < testArray[j + 1]) {
				System.out.println(j);
				j++;
			}
			if(temp > testArray[j]) {
				flag = true;
			} else {
				testArray[i] = testArray[j];
				i = j;
				j = i * 2 + 1;
			}
		}
		testArray[i] = temp;
	}
	public static void initCreateHeap(int[] a) {
		int n = a.length;
		for(int i = (n - 1) / 2; i >= 0; i--) {
			createHeap(a, n, i);
		}
	}
	/** 
	*  堆排序
	*  初始时要把排序的n个数的序列看作是一颗顺序存储的二叉树，调整他们的存储序，使之成为一个堆，将堆顶元素输出，
	*  得到n个元素的最大元素，交换最后一个节点和根节点，然后对当前n-1个元素重新调整使之成为堆，输出对顶元素，得到
	*  n个元素中的次大值，以此类推。
	*  
	* @return void 
	*/
	public static void heapSort() {
		int[] testArray = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		int n = testArray.length;
		int temp;
		initCreateHeap(testArray);
		printArray(testArray);
		for(int i = n - 1; i >= 1; i--) {
			temp = testArray[0];
			testArray[0] = testArray[i];
			testArray[i] = temp;
			createHeap(testArray, i, 0);
		}
		printArray(testArray);
	}
	
	/** 
	* 对当前还未排好序的范围内的全部数，自上而下对相邻的两个数以此进行比较和调整，
	* 让较大的数往下沉，较小的往上冒。  
	* @return void 
	*/
	public static void bubbleSort() {
		int[] testArray = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		int n = testArray.length;
		for( int i = 0; i < n;  i++) {
			for(int j = i + 1; j < n; j++) {
				if( testArray[j] > testArray[j -1]) {
					int temp = testArray[j];
					testArray[j] = testArray[j - 1];
					testArray[j - 1] = temp;
				}
			}
		}
		printArray(testArray);
	}
	
	 public static void bubble1() {
			int[] testArray = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
			int n = testArray.length;
			int i = n - 1;
			while( i > 0) {
				int pos = 0;
				for(int j = 0; j < i ; j++) {
					if(testArray[j] > testArray[j  + 1]) {
						int temp = testArray[j];
						testArray[j] = testArray[j + 1];
						testArray[j + 1] = temp;
						pos = j;
					}
				}
				i = pos;
			}
			printArray(testArray);
	 }
	
	/** 
	*    选择一个基准元素，通常选择第一个元素或者最后一个元素，
	*    通过一趟扫描，将待排序分成两个部分，一部分比基准元素大，
	*    一部分比基准元素小，此时基准元素在其排好序后的正确位置，然后
	*    再用同样的方法递归的排序划分的两个部分
	* @return void 
	*/
	public static void quick() {
		int[] testArray = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
		int n = testArray.length;
		quickSort(testArray, 0, n - 1);
		printArray(testArray);		
	}
	
	public static void quickSort(int[] a, int low, int high) {
		int temp = a[low];
		int i = low;
		int j = high;
		while (i < j) {
			while (i < j && a[j] >= temp) {
				j--;	
			}
			a[i] = a[j]; 
			while (i < j && a[i] <= temp) {
				i++;
			} 
			a[j] = a[i];
		}
		a[i] = temp;
		if(i > low) quickSort(a, low, i-1); 
		if(i < high) quickSort(a, i + 1, high); 
	}
	public static void mergeSortTest() {
		int[] testArray = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
		int n = testArray.length;
		mergeSort(testArray, 0, testArray.length-1);
	}
	
	/** 
	 * 归并排序
	* @Description: 
	* 将两个或两个以上有序表合并成一个新的有序表，即
	* 把待排序序列分为若干个子序列，每个子序列是有序的，
	* 然后再把有序子序列合并为整体有序序列 
	*/
	public static void mergeSort(int[] a, int left, int right) {
       
		if(left < right) {
			int middle = (left + right)/2;
			mergeSort(a, left, middle);
			mergeSort(a, middle + 1, right);
			merge(a, left, middle, right);
		} 
	}
	
	
	
	
	
	
	
	public static void merge(int[] a, int left, int middle, int right) {
		int[] tmpArr = new int[a.length];
		int mid = middle + 1;
		int tmp = left;
		int third = left;
		while(left <= middle && mid <= right) {
			if(a[left] > a[middle]) {
				tmpArr[third++] = a[mid++];
			} else {
				tmpArr[third++] = a[left++];
			}
		} 
		while(left <= middle) {
			tmpArr[third++] = a[left++];
		} 
		while(mid <= right) {
			tmpArr[third++] = a[mid++];
		} 
		while(tmp <= right) {
			a[tmp] = tmpArr[tmp++]; 
		}
		
	}

	public static void radixSort() {
		int[] testArray = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
		int n = testArray.length;
		int max = 0;
		for (int i = 0; i < testArray.length; i++) {
			if(max < testArray[i]){
				max = testArray[i];
			}
		}
		int times = 0;
		while(max > 0) {
			max = max / 10;
			times++;
		}
		 ArrayList queue = new ArrayList();
		 for(int i = 0; i< 10; i++) {
			 ArrayList queue1 = new ArrayList();
			 queue.add(queue1);
		 }
		 
		 for(int i = 0; i < times; i++) {
			 for(int j = 0; j < testArray.length; j++) {
				 int a = testArray[i];
				 int b = a % 10;
				 ArrayList arrayTmp = (ArrayList) queue.get(b);
				 arrayTmp.add(a);
				 queue.set(b, arrayTmp);
				
			 }
			 int count = 0;
			 for(int k = 0; k < 10; k++) {
				
				 while( ((ArrayList) queue.get(k)).size() > 0) {
					 ArrayList arrayTmp = (ArrayList) queue.get(k); 
					 testArray[count] = (int) arrayTmp.get(0);
				     arrayTmp.remove(0);
				     count ++;
				 }
				;
			 }
		 }
		 
		 
		
	}
	
	
	
	
	public static void printArray(int[] array) {
		StringBuilder str = new StringBuilder();
		for(int i :array) {
			str.append(i + " ");
			//System.out.println(i);
		} 
		System.out.println(str);
	}

}
