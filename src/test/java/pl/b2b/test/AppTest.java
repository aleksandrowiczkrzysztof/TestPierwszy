package pl.b2b.test;

import static org.junit.Assert.assertEquals;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@org.junit.Test
	public void policz() {
		int pierwszaLiczba = 2;
		int drugaLiczba = 3;
		assertEquals(5, pierwszaLiczba + drugaLiczba);
	}

	@org.junit.Test
	public void policz2() {
		int pierwszaLiczba = 3;
		int drugaLiczba = 2;
		assertEquals(1, pierwszaLiczba - drugaLiczba);
	}

	@org.junit.Test
	public void policz3() {
		int pierwszaLiczba = 2;
		int drugaLiczba = 3;
		assertEquals(6, pierwszaLiczba * drugaLiczba);
	}

	@org.junit.Test
	public void policz4() {
		int pierwszaLiczba = 6;
		int drugaLiczba = 2;
		if (drugaLiczba == 0) {
			System.out.println("nie dziel przez 0");
		} else {
			assertEquals(3, pierwszaLiczba / drugaLiczba);
		}
	}

	@org.junit.Test
	public void przyklti() {
		// for init zmiennej
		for (int i = 0; i < 10; i++) {
			System.out.println("element " + i);
		}
	}

	@org.junit.Test
	public void przyklad2() {
		for (int i = 0; i < 30; i++) {
			if (i % 3 == 0) {
				System.out.println("element2 " + i);
			}
		}
	}

	@org.junit.Test
	public void przyklad3() {
		for (int i = 0; i <= 99; i++) {
			if (i % 2 != 0) {
				System.out.println("elemnt 3 " + i);
			}
		}
	}

	@org.junit.Test
	public void przyklad4() {
		for (int i = 11; i < 23; i++) {
			int liczbaJednostek = i % 10;
			int liczbaDziesiatek = i / 10;
			System.out.println("suma cyfr dla " + i + " to " + (liczbaJednostek + liczbaDziesiatek));
		}
	}

	@org.junit.Test
	public void przyklad5() {
		for (int i = 11; i < 23; i++) {
			int liczbaJednostek = i % 10;
			int liczbaDziesiatek = i / 10;
			int suma = liczbaJednostek + liczbaJednostek;
			if (suma > 3)
			{					
			System.out.println("suma cyfr dla2 " + i + " to " + (liczbaJednostek + liczbaDziesiatek));
			}
		}
	}
}
