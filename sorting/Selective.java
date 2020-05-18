class Selective extends Sort {
    static int[] array = new int[5];

    Selective(int[] a) {
        array = a;
        System.out.println("Selective sort:");
        print(array);
        sort(array);
        print(array);
        System.out.println("\n");
    }

    static void sort(int[] arr) {
        for (int i1 = 0; i1 < arr.length - 1; ++i1) {
            int min = i1;
            for (int i2 = i1 + 1; i2 < arr.length; ++i2) {
                if(arr[i2] < arr[min])
                    min = i2;
            }
            swap(arr, i1, min);
        }
    }
}