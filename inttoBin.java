public class inttoBin {
    public static void main(String args[]){
        int currentNo = 115;
        int sumNom = 0;
        while(currentNo>0){
            sumNom = sumNom + (currentNo%10);
            currentNo = currentNo/10;
        }
        System.out.println(sumNom);
    }
}
