class proj1{
    public static void main(String[] args) {
        int n=153;
        int sum=0, rem;
        int temp = n;
        while(n!=0){
            rem = n%10;
            sum =sum+ rem*rem*rem;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("This is an armstring number");
        }
        else{
            System.out.println("This is not an armstrixng number");
        }
    }
}