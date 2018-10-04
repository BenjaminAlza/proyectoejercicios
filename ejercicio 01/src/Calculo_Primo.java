public class Calculo_Primo{
	
	public int ComprobacionPrimo(int x){
		
		int i, cont=0;
	    for(i=2; i<x; i++){
			if((x%i)==0){cont=1; 
			    break;
			}
		}
		return cont;
	} 

}
