package pglp3.exo3;

/**
 * <b>"L'implementation de la class emplyer.</b>
 *
 * @author TOUAZI,Lylia
 */
public class Manager extends emplyer {
	/** le nbSousFifres. */
	private int nbSousFifres;

	/**
	 * la methode calcul_salaire.
	 *
	 * @return le calcul_salaire.
	 */
	@Override
	public final int calculsalaire() {
		return super.calculsalaire() + nbSousFifres * 100;
	}

	/**
	 * le constructeur Manager.
	 *
	 * @param salaire    du manager.
	 * @param anciennete du manager.
	 * @param nom        du manager.
	 */
	public Manager(final int salaire, final int anciennete, final String nom) {
		super(salaire, anciennete, nom);
		this.nbSousFifres = nbSousFifres;
	}

}
