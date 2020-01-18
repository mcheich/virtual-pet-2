package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.VirtualPet2;

class VirtualPet2Test {

	// Arrange
	VirtualPet2 underTest = new VirtualPet2();

	@Test
	public void HungerShouldBe0AtStart() {
		// Act
		int result = underTest.getHunger();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void ThirstShouldBe0AtStart() {
		// Act
		int result = underTest.getThirst();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void BoredomShouldBe0AtStart() {
		// Act
		int result = underTest.getBoredom();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		// Act
		underTest.setHunger(1);

		int beforeEat = underTest.getHunger(); //1
		underTest.eat();
		int result = underTest.getHunger();
		// Assert
		assertEquals(beforeEat - 1, result);
	}

	@Test
	public void thirstShouldDecreaseBy1AfterDrink() {
		// Act
		underTest.setThirst(1);
		int beforeDrink = underTest.getThirst();
		underTest.drink();
		int result = underTest.getThirst();
		// Assert
		assertEquals(beforeDrink - 1, result);
	}

	@Test
	public void boredomShouldDecreaseBy1AfterPlay() {
		// Act
		underTest.setBoredom(1);
		int beforePlay = underTest.getBoredom();
		underTest.play();
		int result = underTest.getBoredom();
		// Assert
		assertEquals(beforePlay - 1, result);
	}

	@Test
	public void hungerShouldNotDecreaseBelow0() {
		// Act
		int result = underTest.getHunger();
		underTest.eat();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void thirstShouldNotDecreaseBelow0() {
		// Act
		int result = underTest.getThirst();
		underTest.drink();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void boredomShouldNotDecreaseBelow0() {
		// Act
		underTest.play();
		int result = underTest.getBoredom();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldIncreaseBy1AfterTick() {
		// Act
		int beforeTick = underTest.getHunger();
		underTest.tick(); 
		int afterTick = underTest.getHunger();
		// Assert
		assertEquals(beforeTick, afterTick - 1);
	}

}
