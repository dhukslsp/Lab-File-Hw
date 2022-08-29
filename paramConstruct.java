public class paramConstruct{
	int empid;
	String Empname;
	//Parameterised constructor with name
	paramConstruct(int id,String Name){
		this.empid = id;
		this.Empname = Empname;
	}
	void info(){
		System.out.println("Id "+ empid +" Name: "+Empname);
	}
	public static void main(String args[]){
		paramConstruct obj = new paramConstruct(11,"Dhruv");
		obj.info();
	}
}