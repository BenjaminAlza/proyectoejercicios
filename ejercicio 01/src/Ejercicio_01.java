import java.util.Scanner;
public class Ejercicio_01
{
	public static void main(String[] ARGS)
	{
		
		int x, cont, aux, i;
		Scanner cin=new Scanner(System.in);
		
		do{
		
		cont=0;
	
		System.out.println("Ingrese el numero deseado: ");
		x=cin.nextInt();
		
		for(i=1; i<=x; i++){
			
			if((x%i)==0){
				cont=cont+1;
			}
		}
		
		if(cont==2){System.out.println("El NUMERO ES PRIMO");}
        else if(cont<2){System.out.println("ERROR: NUMERO INVALIDO");}
		else if(cont>2){System.out.println("El NUMERO NO ES PRIMO");}
		
		do{
		System.out.println("\n ¿Desea volver? (SI:1 NO:0): ");
		aux=cin.nextInt();
		}while(aux!=1 && aux!=0);
		if(aux==0) {System.out.println("GRACIAS ;) xD"); System.exit(0);}
        }while(aux==1);
		
		
    }   
}