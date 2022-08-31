public class paramConstruct{
	int empid;
	String Empname;
	//Parameterised constructor with name
	paramConstruct(int id,String Name){
		this.empid = id;
		this.Empname = Name;
	}
	void info(){
		System.out.println("Id "+ empid +" Name: "+Empname);
	}
	public static void main(String args[]){
		paramConstruct obj = new paramConstruct(11,"Dhruv");
		paramConstruct obj2 = new paramConstruct(12,"Dhruv12");
		obj.info();
		obj2.info();
	}
}