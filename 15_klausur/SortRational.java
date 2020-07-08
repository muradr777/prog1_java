public class SortRational {
    static void selectionSort(Rational[] rarr) {
        for(int i1 = 0; i1 < (rarr.length-1); ++i1) {
            int min = i1;
            for(int i2 = i1+1; i2 < rarr.length; ++i2) {
                if(rarr[i2].isLessThan(rarr[min]))
                    min = i2;
            }
            swap(rarr, min, i1);
        }
    }

    static void insertionSort(Rational[] array) {
        for(int i1 = 1; i1 < array.length; ++i1) {
            Rational val = array[i1];
            int i2  = i1;
            while(i2 > 0 && val.isLessThan(array[i2-1])) {
                array[i2] = array[i2-1];
                --i2;
            }
            array[i2] = val;
        }
    }

    static void bubbleSort(Rational[] array) {
        for(int i = 1; i < array.length; ++i) {
            for(int j = 0; j < (array.length-i); ++j) {
                if(array[j+1].isLessThan(array[j]))
                    swap(array, j, j+1);
            }
        }
    }
    
    static void swap(Rational[] field, int posA, int posB) {
        Rational tmp = field[posA];
        field[posA] = field[posB];
        field[posB] = tmp;
    }

    static void printArr(Rational[] array) {
        for(Rational item: array)
            System.out.print(item.toString() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Rational[] rarr = {
            new Rational(-14,7), 
            new Rational(1,3), 
            new Rational(12,-3),
            new Rational(9,0),
            new Rational(1,5)
        };

        System.out.println("\nDieser Program implementiert Rational Sortierverfahren:\n");
        System.out.println("Gegeben ist array:");
        printArr(rarr);
        System.out.println("Nach Sortieren:");
        // selectionSort(rarr);
        // insertionSort(rarr);

        bubbleSort(rarr);
        printArr(rarr);
        System.out.println("\n");
    }
}