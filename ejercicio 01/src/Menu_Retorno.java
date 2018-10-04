import java.util.Scanner;

public class Menu_Retorno {
	
	public int ValorRetorno() {
		
		    int aux;
		    do{
		    Scanner cin2=new Scanner(System.in);
			System.out.println("\n ¿Desea volver? (SI:1 NO:0): ");
			aux=cin2.nextInt();
			}while(aux!=1 && aux!=0);
			
			if(aux==0) {System.out.println("GRACIAS ;) xD"); System.exit(0);}
			
			return aux;
	}

}
