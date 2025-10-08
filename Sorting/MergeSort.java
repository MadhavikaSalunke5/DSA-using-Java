public class MergeSort {

    // Function to merge two sorted halves
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;      // pointer for left half
        int idx2 = mid + 1; // pointer for right half
        int x = 0;          // pointer for merged array

        // Merge elements from both halves
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements of left half (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements of right half (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Function to recursively divide the array
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case: single element
        }
        int mid = si + (ei - si) / 2;

        // Recursive calls for left and right halves
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // Merge the two sorted halves
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length; // ✅ fixed `==` to `=`

        divide(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
