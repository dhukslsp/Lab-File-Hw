class Employee
{
  private int id;
  
  public void setId(int newId)
  {
    id = newId;
  }
  public int getId()
  {
    return id;
  }
}
public class javaexception
  {
    public static void main (String args[])
    {
      Employee emp = new Employee ();
      emp.setId (100);
      System.out.println (emp.getId());
    }
  }