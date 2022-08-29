class faculity{
	String designation = "Professor";
	String CollegeName = "AIIT";
	public void does(){
		System.out.println("Teaching");
	}
}
public class inheritence extends faculity{
	public static void main(String args[]){
		inheritence myf = new inheritence();
		System.out.println(myf.designation);
		System.out.println(myf.CollegeName);
		myf.does();
	}
}