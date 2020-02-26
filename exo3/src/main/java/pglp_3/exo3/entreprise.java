package pglp_3.exo3;

import java.util.ArrayList;
import java.util.List;

public class entreprise {
	private List<calcul> List_calcul;
	
	public entreprise() {
		List_calcul = new ArrayList<calcul>();
	}
	
	public double Somme_Totale_Salaires() {
		double somme = 0;
		for (calcul s : List_calcul) {
			somme=somme+ s.calcul_salaire();
		}
		return somme;
	}
	
 }


