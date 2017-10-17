package pl.b2b.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Test;

public class TestSet {

	@Test
	public void CzyIloscEelementowWSetJestPrawidlowa() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);
		liczby.remove(new Integer(3));
		assertEquals(2, liczby.size());
	}

	@Test
	public void CzyZawiera2() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(2);
		liczby.add(4);

		boolean czyZawiera = liczby.contains(2);

		assertEquals(true, czyZawiera);
	}
	@Test
	public void CzySetZawiera2i3() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);
		boolean czyZawiera2 = liczby.contains(2);
		boolean czyZawiera6 = liczby.contains(6);
		
		assertEquals(false, czyZawiera2 && czyZawiera6);
}
}
