public class StringName{
    static void method(){
        System.out.println("Static Method");
    }
    public void method2(){
        System.out.println("Pubic Method");
    }
    public static void main(String args[]){
        StringName obj = new StringName();
        obj.method();
        obj.method2();
    }
}