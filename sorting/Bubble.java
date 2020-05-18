class Bubble extends Sort {
    static int[] array = new int[5];

    Bubble(int[] a) {
        array = a;
        System.out.println("Bubble sort:");
        print(array);
        sort(array);
        print(array);
        System.out.println("\n");
    }

    static void sort(int[] arr) {
        for(int i1 = 1; i1 < arr.length; ++i1) {
            boolean bAtLeastOneSwap = false;
            for(int i2 = 0; i2 < arr.length-i1; ++i2) {
                    if(arr[i2] > arr[i2+1]) {
                        swap(arr, i2, i2+1);
                        bAtLeastOneSwap = true;
                    }
            } 
            if(!bAtLeastOneSwap)
                return;
        }
    }
}