package pglp_3.exo3;

public class vendeur extends emplyer  {
private int commission;
	public vendeur(int salaire, int anciennete, String nom,int commission) {
		super(salaire, anciennete, nom);
		this.commission=commission;
	}
	@Override
	public int calcul_salaire() {
		 return super.calcul_salaire()+commission;
		 
	}
}
