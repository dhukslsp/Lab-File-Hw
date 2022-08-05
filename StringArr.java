class StrArray{
    String StringArr[] = new String[4];
}
public class StringArr {
    public static void main(String args[]){
        StrArray NewArr = new StrArray();
        NewArr.StringArr[0] = "Dhruv Singh";
        NewArr.StringArr[1] = "Rishi Singh";
        NewArr.StringArr[2] = "Aryan Kaushik";
        NewArr.StringArr[3] = "Yash Agarwal";
        for(int q = 0;q<4;q++){
            System.err.println(NewArr.StringArr[q]);
        }
    }
}
