/*  Zaki G Lindo
    CIS 303 - Algorithm Analysis and Design
    Assignment I - KthLargest.java
    1/31/17
*/


import java.util.*;

public class KthLargest {

    public static void main(String [] args) {
        System.out.println("Select a k value: ");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int [] a = {11, 3, 2, -2, -11, 11, 3, 7, 1};

        System.out.println(KthLargest(a, k));
    }
    // Preconditions: 	An integer array is already initialized, as is some integer k.
    // Parameters: 		int [] original - integer array(not explicitly sorted)
	// 					int k - the kth value if the array was ordered 1-->n, 1 being largest
	//					n being the smallest.
	// Returns:			Kth largest integer in original [] for some natural number k.

    public static int KthLargest(int [] original, int k) {
    	// If the parameter does not make sense(not a natural number) return -1
    	if (k < 1 || k > original.length) 
    		return -1;
        int max = original[0];                             // Init max to check ints in original[]
        for (int i = 1; i < original.length; i++) {
            if (max < original[i])                         // If max > a[i], max = original[i]
                max = original[i];
        }
     	if (k == 1) 							 	       // Base Case k = 1
    		return max;								       // This is the largest value of a[]
        else {
            int [] kth = new int [k];                      // Array to hold 1-->k largest values
            Arrays.fill(kth, Integer.MIN_VALUE);
            kth [0] = max;
            for (int i = 0; i < kth.length; i++) {
                for (int j = 0; j < original.length; j++) {
                    if (contains(kth, original[j]))
                        continue;
                    else if (kth[i] < original[j])
                        kth[i] = original[j];
                }
            }
            return kth[k-1];
        }
 	}

    
    public static boolean contains(int[] a, int target) {
      for (int i = 0; i < a.length; i++) 
         if (target == a[i]) 
            return true;
      return false;
    }
}   
