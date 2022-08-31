class pcExample2{
	private int  var1;
	//default constructoe
 	pcExample2(){
 		this.var1 = 12;
	}
	public pcExample2(int numberr){
 		this.var1 = numberr;
	}
	public int getter(){
		return var1;
	}
}

public class constChaining{
	public static void main(String args[]){
		pcExample2 obj = new pcExample2();
		pcExample2 obj2 = new pcExample2(1324);
		System.out.println(obj.getter());
		System.out.println(obj2.getter());
	}
}
//The Above Code is an example of constructor chaining