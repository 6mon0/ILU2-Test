package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testTest {
	
	test Test;
	@BeforeEach
	void setUp() throws Exception {
		Test = new test();
	}

	@Test
	void FizzAvec1() {
		assertEquals(Test.generate(1),"1");
	}
	
	@Test
	void FizzAvec2() {
		assertEquals(Test.generate(2),"2");
	}
	
	@Test
	void FizzAvec3() {
		assertEquals(Test.generate(3),"Fizz");
	}
	
	@Test
	void FizzAvec6() {
		assertEquals(Test.generate(6),"Fizz");
	}
	
	@Test
	void FizzAvec5() {
		assertEquals(Test.generate(5),"Buzz");
	}
	
	

}
