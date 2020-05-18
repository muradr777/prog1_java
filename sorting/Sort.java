public class Sort {
    public static void main(String[] args) {
        Selective s = new Selective(new int[] {12, 11, -21, 5, -1});
        Insertion is = new Insertion(new int[] {20, 50, -2, -20, -182});
        Bubble b = new Bubble(new int[] {8, -50, 22, -7, 222});
    }

    static void swap(int[] field, int swap, int to) {
        int tmp = field[swap];
        field[swap] = field[to];
        field[to] = tmp;
    }

    static void print(int[] field) {
        for(int i = 0; i < field.length; ++i)
            System.out.print(field[i] + ", ");
        System.out.println();
    }
}