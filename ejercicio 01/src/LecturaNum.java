import java.util.Scanner;

public class LecturaNum{	

	public int LecturaNumPrincipal() {
		int x;
		Scanner cin=new Scanner(System.in);
		System.out.println("Ingrese el numero deseado: ");
		x=cin.nextInt();
		return x;
	}
}
