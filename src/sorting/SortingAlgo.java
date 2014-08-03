package sorting;

public class SortingAlgo {
       
		
		//Selection Sort
		public int[] selectionSort(int [] list){
			int temp = 0;
			for(int i=0; i<list.length;i++){
				
				for(int j=i+1; j<list.length; j++){
	  				if(list[i]>list[j]){
						temp = list[i];
						list[i] = list[j];
						list[j] = temp;
					} //end of if
				} //end of inner for loop
			} //end of outer for loop
			
			//ready to print sorted order
//			for(int n=0; n<list.length;n++){
//				System.out.println(list[n]);
			
			
        	

			return list;
		}
		
		//Insertion Sort
		public int [] insertionSort (int [] array){
			int i,j;
			for(i=1; i<array.length; i++)
			{
				int temp = array[i];
				j=i;
				while(j>0 && array[i-1]>=temp){
					array[j]=array[j-1];
					--j;
				}
			}
			
			return array;
		}
		
		//Bubble Sort
		public int[] bubbleSort(int [] array){
			int temp=0;
			int j, i;
			for(  i=array.length-1;i>1;i--){
				for(  j=0;j<i;j++)
					if(array[j]>array[j+1]){
						 temp= array[j];
						 array[j] = array[j+1];
						 array[j+1] = temp;
					}
			}
			
			
			return array;
		}
		
		//Merge Sort
		public int[] mergeSort(int [] array){
			
			
			
			return array;
		}
		
}
