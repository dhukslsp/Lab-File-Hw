import java.util.Scanner;

public class Myprog {
    public static int printsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the maximum number");
        n = sc.nextInt();
        int call = printsum(n);
        System.out.print(call);
    }

}