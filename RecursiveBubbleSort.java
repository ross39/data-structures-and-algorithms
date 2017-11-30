package javaalgorithms;
import java.util.*;

//this is a recursive version of the traditional bubble sort
public class RecursiveBubbleSort 
{
	static void bubbleSort(int arr[], int n)
	{
		//setting up the recursive definition
		if (n == 1)
		{
			return;
		}
		
		 // One pass of bubble sort. After       All in all this is a shorter solution to a traditional bubble sort although it doesn't change the speed
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int tempVariable = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tempVariable;
            }
      
        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }
	
	//driver method
	// Driver Method
    public static void main(String[] args)
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("before :");
        System.out.println(Arrays.toString(arr));
      
        bubbleSort(arr, arr.length);
         
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }
}

