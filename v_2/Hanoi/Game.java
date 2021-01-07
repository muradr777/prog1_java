public class Game {
    public static void printStone(int iWidth) {
        if(iWidth==0) {
            for(int i=0; i < 21; ++i)
                System.out.print(" ");
        } else {
            for(int i=0; i < (21-iWidth)/2; ++i)
                System.out.print(" ");
            for(int i=0; i < iWidth; ++i)
                System.out.print("+");
            for(int i=0; i < (21-iWidth)/2; ++i)
                System.out.print(" ");
        }
    }
    
    public static void printTowers(int[][] towers) {
        for(int y=0; y < towers[0].length; ++y) {
            for(int x=0; x < towers.length; ++x) {
                printStone(towers[x][y]);
            }
            System.out.println();
        }

        System.out.print("----------------------");
        System.out.println("----------------------\n\n");
    }
    
    public static void setInitTower(int[][] towers) {
        for(int i=0; i < towers[0].length; ++i) {
            towers[0][i] = 2*i+1;
        }
    }
    
    public static void init(int[][] towers) {
        for(int y=0; y < towers.length; ++y) {
            for(int x=0; x < towers[y].length; ++x) {
                towers[y][x] = 0;
            }
        }

        setInitTower(towers);
    }

    public static void moveStone(int[][] towers, int iFrom, int iTo) {
        for(int i=0; i < towers[iFrom].length; ++i) {
            if(towers[iFrom][i] != 0) {
                int iStone = towers[iFrom][i];
                towers[iFrom][i] = 0;
                for(int j=0; j < towers[iTo].length; ++j) {
                    if(towers[iTo][j] != 0) {
                        towers[iTo][j] = iStone;
                        return;
                    }
                }
                towers[iTo][towers[iTo].length-1] = iStone;
                return;
            }
        }
    }
    
    public static void move(int[][] towers, int N, int von, int nach, int ueber) {
        if(N > 1) {
            move(towers, N-1, von, ueber, nach);
            moveStone(towers, von, nach);
            System.out.println("Bewegen von " + von + " nach " + nach);
            move(towers, N-1, ueber, nach, von);
        }
    }

    public static void main(String[] args) {
        int[][] towers = new int[3][5];
        init(towers);
        printTowers(towers);
        move(towers, towers[0].length, 0, 2, 1);
    }
}