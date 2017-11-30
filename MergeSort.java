package javaalgorithms;

import org.omg.CORBA.PUBLIC_MEMBER;

//divide and conquer algorithm
public class MergeSort {
	
	void merge(int arr[], int l, int m, int r)
	{
		//find the size of the sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//create temp arrays
		int L[] = new int[n1];
		int R[] = new int [n2];
		
		
		 /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    //print out the array
    static void printArray(int arr[])
    {
    		int n = arr.length;
    		for (int i = 0; i < n; ++i) 
    		{
    			System.out.print(arr[i] + " ");
    			System.out.println();
		}
    		
    }
    
    //This is a driver method for the array
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7,5,2,3,4,3,4,3,4,3,4,5,6,67,3,25,4,152343,53452,1234134,23423423,523543,75657,432,1245345,34535345,3453,45,23452345,23452,3453425,2346,4567,67678,678,567835673,4567234,5673456,3567334,456235673,66375,3472,772};
 
        System.out.print("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.print("\nSorted array");
        printArray(arr);
    }
		
}
	
