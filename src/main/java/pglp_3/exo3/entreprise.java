package pglp_3.exo3;

import java.util.ArrayList;
import java.util.List;

public class entreprise {
	List<calcul> List_calcul;
	
	public entreprise() {
		List_calcul = new ArrayList<calcul>();
		
	}
	
	public int Somme_Totale_Salaires() {
		int somme = 0;
		for (calcul s : List_calcul) {
			// System.out.println(somme);
			 //System.out.println(s.calcul_salaire());
			somme=somme+ s.calcul_salaire();
			 // System.out.println(somme);
		}
		return somme;
	}
	public List<calcul> getkk(){
	return 	List_calcul;
	}
 }



