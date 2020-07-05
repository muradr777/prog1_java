public class Wurzel {
    static int pow(int z, int i, int res) {
        return i == 0 ? res : pow(z, --i, res*z); // 1 * 1
    }
    static int rec_wurz(int z, int i, int c) {
        if(z > 0 && i > 0 && z >= c)
            return (z % c == 0 && pow(c, i, 1) == z) ? c : rec_wurz(z, i, ++c);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(rec_wurz(25,2,1));
    }
}