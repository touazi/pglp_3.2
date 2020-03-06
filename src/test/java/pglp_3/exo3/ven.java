package pglp_3.exo3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ven {

	@Test
	public void testVEND1() {
		
		vendeur v=new vendeur(1500,4,"lylia",100);
		int k=v.calcul_salaire();
		assertEquals(k,1680);
	}
	@Test
	public void testVEND2() {
		
		vendeur v=new vendeur(1500,4,"lylia",200);
		int k=v.calcul_salaire();
		assertEquals(k,1780);
	}

}
