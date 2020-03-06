package pglp_3.exo3;


public class Manager extends emplyer {


	private int nbSousFifres;
	
	@Override
	public int calcul_salaire() {
		return super.calcul_salaire() + nbSousFifres * 100;
	}
	public Manager(int salaire, int anciennete, String nom) {
		super(salaire, anciennete, nom);
		this.nbSousFifres=nbSousFifres;
	}
	
}