public class paramerter{
	int empid;
	String empName;
	String newname;
	paramerter(int id,String name, String Newname){
		this.empid = id;
		this.empName = name;
        this.newname = Newname;
	}
	void info(){
		System.out.println("id "+empid+ "Name "+empName);
	}
}