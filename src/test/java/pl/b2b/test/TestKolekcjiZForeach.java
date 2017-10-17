package pl.b2b.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class TestKolekcjiZForeach {

	@Test
	public void testKolekcji() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(4);
		liczby.add(3);

		int licznik = 0;
		for (Integer zmienna : liczby) {
			if (zmienna > 2) {
				System.out.println(zmienna);
				licznik++;
			}
		}
		assertEquals(2, licznik);
	}

	@Test
	public void testKolekcjiNieParzyste() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(5);
		liczby.add(2);

		int licznik = 0;
		for (Integer zmienna : liczby) {
			if (zmienna % 2 != 0) {
				System.out.println(zmienna);
				licznik++;
			}
		}
		assertEquals(1, licznik);
	}

	@Test
	public void testKolekcjiSumaMniejszaOd3() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(52);
		liczby.add(20);

		int licznik = 0;
		for (Integer zmienna : liczby) {
			int liczbaJednostek = zmienna % 10;
			int liczbaDziesiatek = zmienna / 10;
			int suma = liczbaJednostek + liczbaDziesiatek;
			if (suma < 3) {
				licznik++;
			}
		}
		assertEquals(1, licznik);
	}
}
