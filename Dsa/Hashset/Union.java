
// Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
// Examples:

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: 1 2 3 4 5 6 7
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
// Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
// Output: 1 2 3 4 5
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        HashSet<Integer>set=new HashSet<>();
        
        // Add all elements from the first array
        for (int num : a) {
            set.add(num);
        }

        // Add all elements from the second array
        for (int num : b) {
            set.add(num);
        }
        
     // Convert the HashSet to an array
        Integer[] array = set.toArray(new Integer[0]);
        
        // Sort the array
        Arrays.sort(array);
        
        // Convert the sorted array to an ArrayList and return
        return new ArrayList<>(Arrays.asList(array));
    }
}
