public class paramconst2{
	private int num;
	public paramconst2(int Num){
		this.num = Num;
	}
	public int display(){
		return num;
	}
	public static void main (String args[]){
		paramconst2 obj = new paramconst2(12);
		System.out.println(obj.display());

	}
}