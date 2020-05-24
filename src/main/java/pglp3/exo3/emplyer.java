package pglp3.exo3;

/**
 * <b>"L'implementation de la class emplyer.</b>
 *
 * @author TOUAZI,Lylia
 */
public class emplyer implements calcul {
	/**
	 * le salaire de l'employer.
	 */
	private int salaire;
	/**
	 * L'ancienter de l'en=mployer.
	 */
	private int anciennete;
	/**
	 * nom amployer.
	 */
	private String nom;

	/**
	 * constructeru de la class emplyer.
	 *
	 * @param salaire    le salaire.
	 * @param anciennete l'ancienter.
	 * @param nom        nom employer
	 */
	public emplyer(final int salaire, final int anciennete, final String nom) {
		this.anciennete = anciennete;
		this.nom = nom;
		this.salaire = salaire;
	}

	/**
	 * methode calcul_salaire.
	 *
	 * @return la salaire total de l'empoyer.
	 */
	public int calculsalaire() {
		salaire = salaire + anciennete * 20;
		return salaire;
	}
}
