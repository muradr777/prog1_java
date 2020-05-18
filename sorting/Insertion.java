class Insertion extends Sort {
    static int[] array = new int[5];

    Insertion(int[] a) {
        array = a;
        System.out.println("Insertion sort:");
        print(array);
        sort(array);
        print(array);
        System.out.println("\n");
    }

    static void sort(int[] arr) {
        for(int i1 = 1; i1 < arr.length; ++i1) {
            int tmp = arr[i1];
            int i2 = i1;
            while(i2 > 0 && arr[i2-1] > tmp) {
                arr[i2] = arr[i2-1];
                --i2;
            }
            arr[i2] = tmp;
        }
    }    
}