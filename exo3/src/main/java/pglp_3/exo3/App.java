package pglp_3.exo3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	emplyer v=new vendeur(1500,4,"lylia",100);
        int k=v.calcul_salaire();
        System.out.println(k);
        System.out.println( "Hello World!" );
        entreprise E = new entreprise();
        E.List_calcul.add(v);
        System.out.println(k);
        
    
       
int j=E.Somme_Totale_Salaires();
        System.out.println( j );
    }

    
   
}
