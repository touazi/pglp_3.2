package pglp3.exo3;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>"L'implementation de la class entreprise.</b>
 *
 * @author TOUAZI,Lylia
 */
public final class entreprise {
	/** liste de calcu. */
	List<calcul> Listcalcul;

	/** constructeur de la class entrepris. */
	public entreprise() {
		Listcalcul = new ArrayList<calcul>();

	}

	/**
	 * methode Somme_Totale_Salaires.
	 *
	 * @return la somme total des emplyeurs.
	 */
	public final int SommeTotaleSalaires() {
		int somme = 0;
		for (calcul s : Listcalcul) {
			somme = somme + s.calculsalaire();
		}
		return somme;
	}

	/**
	 * methode getkk.
	 *
	 * @return la liste des calcul des emplyeurs.
	 */
	public final List<calcul> getkk() {
		return Listcalcul;
	}
}
