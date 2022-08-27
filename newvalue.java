class constructor{
    private int var;
    //default constructor
    public constructor()
    {
        this.var = 10;
    }
    public constructor(int num){
        this.var = num;
    }
    public int getvalue(){
        return var;
    }
}
public class newvalue {
    
    public static void main(String args[]) {
        constructor obj = new constructor(12);
        constructor onj2 = new constructor(12);
        System.out.println("Var is "+ obj.getvalue());
    }
}
