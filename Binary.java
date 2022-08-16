public class Binary {
    public static void main(String args[]) {
        long rem = 0;
        long num = 1100;
        double sum = 0, i = 0;
        while (num != 0) {
            sum = sum + rem * Math.pow(2, i);
            i = i + 1;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
