public class Rational  {
    static void bubbleSort(int[] array) {
        for(int i = 1; i < array.length; ++i) {
            for(int j = 0; j < (array.length-i); ++j) {
                if(array[j] > array[j+1])
                    swap(array, j, j+1);
            }
        }
    }

    static void insertionSort(int[] array) {
        for(int i1 = 1; i1 < array.length; ++i1) {
            int val = array[i1];
            int i2  = i1;
            while(i2 > 0 && array[i2-1] > val) {
                array[i2] = array[i2-1];
                --i2;
            }
            array[i2] = val;
        }
    }

    static void selectionSort(int[] array) {
        for(int i1 = 0; i1 < (array.length-1); ++i1) {
            int min = i1;
            for(int i2 = i1+1; i2 < array.length; ++i2) {
                if(array[i2] < array[min])
                    min = i2;
            }
            swap(array, min, i1);
        }
    }

    static void swap(int[] field, int posA, int posB) {
        int tmp = field[posA];
        field[posA] = field[posB];
        field[posB] = tmp;
    }

    static void printArr(int[] array) {
        for(int item: array)
            System.out.print(item + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 22, -10, -100, 5, 25};
        int[] nums1 = {-300, 11, -1, 0, 75, 23};
        int[] nums2 = {2000, 3, -20, 55, -1, 3};

        System.out.println("\nDieser Program implementiert Sortierverfahren:\n");
        System.out.println("Gegeben ist array:");
        printArr(nums2);
        System.out.println("Nach Sortieren:");
        // bubbleSort(nums);
        // insertionSort(nums1);
        selectionSort(nums2);
        // * Print result
        printArr(nums2);
    }
}