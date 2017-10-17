package pl.b2b.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestKolekcji {

	@Test
	public void testKolekcjiZLiczbami() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(5);
		assertEquals(3, liczby.size());
	}

	@Test
	public void testKolekcjiZLiczbamiZDouble() {
		List<Double> liczby = new ArrayList<Double>();
		liczby.add(2.0);
		liczby.add(4.0);
		liczby.add(5.2);
		assertEquals(3, liczby.size());
	}

	@Test
	public void testKolekcjiZLiczbamiCzyZawieraDwa() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(5);
		boolean czyZawiera = liczby.contains(2);
		assertEquals(true, czyZawiera);
	}

	@Test
	public void testKolekcjiCzyListaPoUsunieciuElementuZmiejszylaSie() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(5);
		liczby.remove(0);
		assertEquals(2, liczby.size());
	}
}
