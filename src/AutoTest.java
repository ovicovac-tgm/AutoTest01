import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

	@Test
	public void typeTest() {
		Auto x = new Auto();
		System.out.println(x.getType());
		Assert.assertEquals("1.Konstruktor Test", "Ford", x.getType());

	}
	
	@Test
	public void typeTestToString() {
		Auto x = new Auto();
		System.out.println(x.getType());
		Assert.assertEquals("Test", "ford, rot, 140PS", "ford, rot, 140PS");

	}

	@Test
	public void colorTest() {
		Auto x = new Auto();
		System.out.println(x.getFarbe());
		Assert.assertEquals("Farbtest", Color.red, x.getFarbe());

	}

	@Test
	public void leistungTest() {
		Auto x = new Auto();
		System.out.println(x.getLeistung());
		Assert.assertEquals("PSTest", 160, x.getLeistung());

	}

	@Test
	public void typeTest2() {
		Auto x = new Auto("Ferarri", Color.RED, 500);
		System.out.println(x.getType());
		Assert.assertEquals("2.Konstruktor Test", "Ferarri", x.getType());

	}

	@Test
	public void farbTest2() {
		Auto x = new Auto("Ferarri", Color.RED, 500);
		System.out.println(x.getType());
		Assert.assertEquals("2.Konstruktor Test", Color.RED, x.getFarbe());

	}

	@Test
	public void leistungTest2() {
		Auto x = new Auto("Ferarri", Color.RED, 500);
		System.out.println(x.getType());
		Assert.assertEquals("2.Konstruktor Test", 500, x.getLeistung());

	}

	@Test(expected = IllegalArgumentException.class)
	public void IllegalArgumentExceptionTest() {
		Auto x = new Auto(null, Color.BLACK, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void IllegalArgumentExceptionTest2() {
		Auto x = new Auto("BMW", null, 30);
	}

}
