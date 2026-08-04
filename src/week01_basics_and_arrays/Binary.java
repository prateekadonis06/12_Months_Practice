package week01_basics_and_arrays;


import java.util.Arrays;

public class Binary{

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {56, 2, 8, 23, 12, 91, 5, 16, 38, 72};


        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));


        int target = 23;
        int resultIndex = binarySearch(numbers, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}
