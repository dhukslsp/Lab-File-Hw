public class newtrycatch{
	public static void main(String args[]){
		try{
			try{
				System.out.println(10/0);
				catch(NullPointerException e){
					System.out.println(e)
				}
			}
		}
		catch(Exception e){
			System.out.println(e)
		}
	}
}