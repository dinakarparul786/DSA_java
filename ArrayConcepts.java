import java.util.*;

public class ArrayConcepts {
    public static int linearSearch(int key, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largest_smallestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        if (start == end) {
            return arr[0];
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int firstI = 0;
        int lastI = arr.length - 1;

        while (firstI < lastI) {
            // swap
            int temp = arr[lastI];
            arr[lastI] = arr[firstI];
            arr[firstI] = temp;

            firstI++;
            lastI--;
        }
    }

    public static void pairsOfArray(int arr[]) {
        int totPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                totPairs++;
            }
            System.out.println();
        }
    }

    public static int subArrays(int arr[]) {
        int totSubArr = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                totSubArr++;
                System.out.println();
            }
            System.out.println();
        }
        return totSubArr;
    }

    public static void main(String args[]) {
        // linear search
        // int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // int key = 11;

        // int index = linearSearch(key, arr);
        // System.out.println(index);

        // largest - smallest array
        // int arr[] = { 1, 2, 6, 3, 5 };
        // int larg = largest_smallestNumber(arr);
        // System.out.println(larg);

        // binary search
        // int arr[] = { 1, 4, 8, 19, 20, 29, 99 };
        // int key = 120;

        // int ind = binarySearch(arr, key);
        // System.out.println(ind);

        // reverse an array
        // int arr[] = { 1, 5, 2, 9, 0, 23, 17, 52 };
        // reverseArray(arr);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // pairs of an array
        // int arr[] = { 2, 7, 8, 12, 1, 5 };
        // pairsOfArray(arr);

        int arr[] = { 2, 4, 6, 8, 10 };
        int val = subArrays(arr);
        System.out.println(val);
        subArrays(arr);

    }
}
