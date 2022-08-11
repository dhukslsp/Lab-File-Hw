import java.util.*;
public class NewCodePrac
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.println("Enter"+i+"th row and "+j+"th column");
                numbers[i][j] = sc.nextInt();
            }
        }
    
        for(int i= 0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
             System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }    
    }
}