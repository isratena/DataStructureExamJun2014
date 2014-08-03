package sorting;

public class ApplySorting {

	public static void main(String[] args) {
		/*
		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers.
		 */
		int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
		
		SortingAlgo sort = new SortingAlgo();
		sort.bubbleSort(array);
		System.out.println(" Bubble sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		
		
		sort.selectionSort(array);
		System.out.println();
		System.out.println("Selection sort:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		
         sort.insertionSort(array);
         
         System.out.println();
 		System.out.println("Insertion sort:");
	
         for (int i = 0; i < array.length; i++) {
 			System.out.print(array[i]+" ");
}}}
