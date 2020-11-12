// ? 05 Life TF
import java.util.Scanner;

public class Life {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("Type length: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        for(int y=0; y < length; ++y) {
            for(int x=0; x < length; ++x) {
                if(x % i == 0)
                    System.out.print("T");
                else
                    System.out.print("F");
            }
            System.out.println();
            ++i;
        }                
    }
}