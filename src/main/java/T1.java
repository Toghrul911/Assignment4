import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= i; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
