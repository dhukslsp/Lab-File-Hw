class muntiply{
	static int muntiply(int a,int b){
		return a*b;
	}
	static double muntiply(double a,double b){
		return a*b;
	}
}

public class methodoverload{
	public static void main(String args[]){
		System.out.println(muntiply.muntiply(12,13));
		System.out.println(muntiply.muntiply(12.12,13.43));
	}
}