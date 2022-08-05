class myobj {
    int marks[] = new int[4];
}

public class Array {
    public static void main(String args[]) {
        myobj NewArr = new myobj();
        NewArr.marks[0] = 12;
        NewArr.marks[1] = 2;
        NewArr.marks[2] = 3;        
        for(int i = 0;i<3;i++){
            System.out.println(NewArr.marks[i]);
        }
    }
}
