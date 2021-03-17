package io.github.oliviercailloux.sample_junit_5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SuperComputerTests {

	@Test
	void testComplicatedComputationWithParameter0() {
		SuperComputer computer = new SuperComputer();
		int actual = computer.complicatedComputation(0);
		Assertions.assertEquals(3, actual);
	}

}
