package pglp3.exo3;

/**
 * <b>"L'implementation de la class vendeur.</b>
 *
 * @author TOUAZI,Lylia
 */
public class vendeur extends emplyer {
	/** la commission de l'employer. */
	private int commission;

	/**
	 * le constructeur de la class vendeur.
	 *
	 * @param salaire    le salaire du vendeur.
	 * @param anciennete l'anciennete du vendeur.
	 * @param nom        le nom du vendeur.
	 * @param commission la commission du vendeur.
	 */
	public vendeur(final int salaire, final int anciennete, final String nom, final int commission) {
		super(salaire, anciennete, nom);
		this.commission = commission;
	}

	/**
	 * la methode calcul_salaire.
	 *
	 * @return le calcul_salaire.
	 */
	@Override
	public int calculsalaire() {
		return super.calculsalaire() + commission;

	}
}
