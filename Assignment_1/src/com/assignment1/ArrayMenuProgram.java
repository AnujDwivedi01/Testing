package com.assignment1;

class ArrayMenuProgram {

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        System.out.println("Original Array:");
        display(arr);

        // Find maximum
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        System.out.println("Maximum Value: " + max);

        // Count even and odd
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

        // Sort array
        insertionSort(arr);
        System.out.println("Sorted Array:");
        display(arr);
    }
}
