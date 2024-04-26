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
		assertEquals(Test.generate(1,1),"1");
	}
	
	@Test
	void FizzAvec2() {
		assertEquals(Test.generate(2,2),"2");
	}
	
	@Test
	void FizzAvec3() {
		assertEquals(Test.generate(3,3),"Fizz");
	}
	
	@Test
	void FizzAvec6() {
		assertEquals(Test.generate(6,6),"Fizz");
	}
	
	@Test
	void FizzAvec5() {
		assertEquals(Test.generate(5,5),"Buzz");
	}
	
	@Test
	void FizzAvec10() {
		assertEquals(Test.generate(10,10),"Buzz");
	}
	
	@Test
	void FizzAvec15() {
		assertEquals(Test.generate(15,15),"FizzBuzz");
	}
	
	@Test
	void FizzAvec30() {
		assertEquals(Test.generate(30,30),"FizzBuzz");
	}
	
	@Test
	void Fizzde1a5() {
		assertEquals(Test.generate(1,5),"12Fizz4Buzz");
	}
	
	
	
	
	

}
