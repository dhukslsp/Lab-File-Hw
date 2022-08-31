class person{
	private String name;
	//Making a getter method
	public String getname(){
		return name;
	}
	//making a setter method
	public void setname(String newname){
		this.name = newname;
	}
}
public class encaptulation{
	public static void main(String args[]){
		person myobj = new person();
		myobj.setname("Dhruv Singh");
		System.out.println(myobj.getname());
	}
}