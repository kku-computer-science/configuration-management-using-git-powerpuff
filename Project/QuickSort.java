import java.util.Random;

public class QuickSort {

	  public static void quicksort(int[] array) {
	    quicksort(array, 0, array.length - 1);
	  }

	  public static void quicksort(int[] array, int lowIndex, int highIndex) {

	    if (lowIndex >= highIndex) {
	      return;
	    }

	    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
	    int pivot = array[pivotIndex];
	    swap(array, pivotIndex, highIndex);

	    int leftPointer = partition(array, lowIndex, highIndex, pivot);

	    quicksort(array, lowIndex, leftPointer - 1);
	    quicksort(array, leftPointer + 1, highIndex);

	  }

	  public static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
	    int leftPointer = lowIndex;
	    int rightPointer = highIndex - 1;

	    while (leftPointer < rightPointer) {

	      // หาจากซ้ายไปขวา จนเจอเลขที่มีค่ามากกว่าpivotหรือจนกว่าleftPointerชนกับrightPointer
	      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
	        leftPointer++;
	      }

	      // หาจากขวาไปซ้าย จนเจอเลขที่มีค่าน้อยกว่าpivot หรือจนกว่าจนกว่าleftPointerชนกับrightPointer
	      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
	        rightPointer--;
	      }
	      //ถ้าออกจากลูปWhile ทำการ swap
	      swap(array, leftPointer, rightPointer);
	    }
	    
	    //กรณีค่าสุดท้ายอาจไม่อยู่ในลำดับ
	    if(array[leftPointer] > array[highIndex]) {
	      swap(array, leftPointer, highIndex);
	    }
	    else {
	      leftPointer = highIndex;
	    }
	    
	    return leftPointer;
	  }

	  public static void swap(int[] array, int index1, int index2) {
	    int temp = array[index1];
	    array[index1] = array[index2];
	    array[index2] = temp;
	  }

	  
	 public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
}
