class InttToBin{
    public static void main(String[] args) {
        int input = 154;
        String remainder = "";
        String finalStr = "";
        int i;
        while(input>0){
            remainder += input%2;
            input = input / 2;
        }
        for (i = remainder.length() ; i >= 0; i--) {
            if (i == remainder.length()) {
                finalStr = finalStr + remainder.substring(i);
            } else {
                finalStr = finalStr + remainder.substring(i, i + 1);
            }
        }
        System.out.println(finalStr);

    }
}