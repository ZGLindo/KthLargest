import java.util.*;

public class KthLargest {

    // Preconditions: 	An integer array is already initialized, as is some integer k.
    // Parameters: 		int [] a - integer array(not explicitly sorted)
	// 					int k - the kth value if the array was ordered 1-->n, 1 being largest
	//					n being the smallest.
	// Returns:			Kth largest integer in a [] for some natural number k.
    public static int KthLargest(int [] a, int k) {
    	// If the parameter does not make sense(not a natural number) return -1
    	if (k < 1) 
    		return -1;
     	if (k == 1) {							 	// Base Case k=1
    		int max = a[0];							// Init max to check ints in a[]
    		for (int i = 1; i < a.length; i++) {
    			if (max > a[i])						// If max > a[i], max = a[i]
    				max = a[i];
    		}
    		return max;								// This is the largest value of a[]
    	} else {									// If k > 1

    	}

 	}

  
}   
