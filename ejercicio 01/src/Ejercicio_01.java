public class Ejercicio_01
{
	public static void main(String[] ARGS)
	{
	    int num;
	    int auxreport;
	    int auxret;
		
		do{
		
		LecturaNum myclase= new LecturaNum();
		num=myclase.LecturaNumPrincipal();
		
		Calculo_Primo myclase2= new Calculo_Primo();
		auxreport=myclase2.ComprobacionPrimo(num);
		
		ReportePrimo myclase3= new ReportePrimo();
		myclase3.MensajeReporte(auxreport);
		
	    Menu_Retorno myclase4= new Menu_Retorno();
	    auxret=myclase4.ValorRetorno();
		
        }while(auxret==1);
		
    }

}