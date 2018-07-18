package DogTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ifti.Dog;

public class DoggyTest {
	
	@Test
	public void testPosition() {
		Dog d = new Dog(10);
		assertEquals("the test failed", d.getPosition(),10);
	}
	
	@Test
	public void testPositionSet() {
		Dog dg = new Dog(10);
		dg.setPosition(10);
		assertEquals("the test failed", dg.getPosition(),10);
	}
	

	@Test
	public void position() {
		Dog dg = new Dog(10);
		dg.setPosition(10);
		assertEquals("the test failed", dg.position(),10);
	}
}
