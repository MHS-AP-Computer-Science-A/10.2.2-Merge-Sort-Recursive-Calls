import java.util.ArrayList;

public class MergeSortRecursive {
static int count = 0;
    
    public static void main(String[] args)
    {
        //Make a random array of size 100
        int[] arr = makeRandomArray(100);
        
        //Call mergesort on the array
        
        //Print out the number of recursive calls
        
        
        //Now do the same for 1000 (be sure to reset count to 0)
        
        //Now do the same for 10000 (be sure to reset count to 0)
        
        //Now do the same for 100000 (be sure to reset count to 0)
        
        
    }
    
    public static void mergeSort(int[] arr) {

		// Base case length 1
		if (arr.length == 1) {
			return;
		}

		// Split in halves
		int mid = arr.length / 2; // Find middle

		// Create two new arrays
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		// Fill left half
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		// Fill right half
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i + mid];
		}

		// Recursive calls
		mergeSort(left);
		mergeSort(right);

		// Merge the halves
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		//Look at first element and take smaller
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		//Copy remaining when 1 array is empty
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
	
	    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}
