import java.util.Scanner;
public class Ejercicio_01
{
	public static void main(String[] ARGS)
	{
		int x;
		int cont, aux, i;
		Scanner cin=new Scanner(System.in);
		
		do{
		
		cont=0;
	
		System.out.println("Ingrese el numero deseado: ");
		x=cin.nextInt();
		
		for(i=2; i<x; i++){
			
			if((x%i)==0){cont=1; 
			    break;
			}
		}
		
		if(cont==1){System.out.println("El NUMERO NO ES PRIMO");}
		else{System.out.println("El NUMERO ES PRIMO");}
		
		do{
		System.out.println("\n ¿Desea volver? (SI:1 NO:0): ");
		aux=cin.nextInt();
		}while(aux!=1 && aux!=0);
		if(aux==0) {System.out.println("GRACIAS ;) xD"); System.exit(0);}
        }while(aux==1);
		
		
    }   
}