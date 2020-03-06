package pglp_3.exo3;

public class emplyer implements calcul {
private int salaire;
private int anciennete ;
private String nom;
public emplyer(int salaire,int anciennete,String nom ) {
this.anciennete=anciennete;
this.nom=nom;
this.salaire=salaire;
}
   

public int calcul_salaire() {
	salaire= salaire+anciennete*20;
	return salaire;
}
}
