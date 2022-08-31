class parent{
	void Print(){
		System.out.println("parent class");
	}
}

class sublclass1 extends parent{
	void Print(){
		System.out.println("sublclass1");
	}
}
class sublclass2 extends parent{
	void Print(){
		System.out.println("sublclass2");
	}
}
public class runtimepoly{
	public static void main(String args[]){
		parent a;
		a = new sublclass1();
		a.Print();
		a = new sublclass2();
		a.Print();
	}
}