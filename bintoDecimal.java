import java.lang.Math;

public class bintoDecimal {
    public static void main(String args[]){
        int input = 101000110;
        int temp = input;
        int sum = 0;
        int pos = 0;
        while(temp>0){
            sum = sum + (int) (temp%10* Math.pow(2, pos));
            temp = temp/10;
            // System.out.println(pos);
            pos = pos + 1;
        }
        System.out.println(sum);
    }
}
