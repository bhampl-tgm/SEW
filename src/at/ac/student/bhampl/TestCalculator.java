package at.ac.student.bhampl;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Burkhard Hampl
 * @version 0.1
 */
public class TestCalculator {

	private Calculator calculator;

	/**
	 * wird zuerst ausgefuehrt
	 */
	@Before
	public void before() {
		this.calculator = new Calculator();
		this.calculator.addValue(-1);
		this.calculator.addValue(0);
		this.calculator.addValue(1);
		this.calculator.addValue(123);
		this.calculator.addValue(-123);
		this.calculator.addValue(-5.5);
		this.calculator.addValue(5.5);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	/**
	 * Test fure {@link Calculator#toString()}
	 */
	@Test
	public void test_toString() {
		assertEquals("[-1.0,0.0,1.0,123.0,-123.0,-5.5,5.5]", this.calculator.toString());
	}

//	/**
//	 * Test fure {@link Calculator#addValue(double)}
//	 */
//	@Test
//	public void test_addValue() {
//		this.calculator.addValue(-5);
//		this.calculator.addValue(27.9);
//		this.calculator.addValue(42);
//	}

	/**
	 * Test fure {@link AdditionCalculator}
	 */
	@Test
	public void test_AdditionCalculator() {
		this.calculator.setCalculatable(new AdditionCalculator());
		this.calculator.setModifiert(42);
		List<Double> test = new ArrayList<Double>();
		test.add((double) -1 + 42);
		test.add((double) 0 + 42);
		test.add((double) 1 + 42);
		test.add((double) 123 + 42);
		test.add((double) -123 + 42);
		test.add((double) -5.5 + 42);
		test.add((double) 5.5 + 5);
		assertEquals(test, this.calculator.processCalculations());
	}

	/**
	 * Test fure {@link DivisionCalculator}
	 */
	@Test
	public void test_DivisionCalculator() {
		this.calculator.setCalculatable(new DivisionCalculator());
		this.calculator.setModifiert(42);
		List<Double> test = new ArrayList<Double>();
		test.add((double) -1 / 42);
		test.add((double) 0 / 42);
		test.add((double) 1 / 42);
		test.add((double) 123 / 42);
		test.add((double) -123 / 42);
		test.add((double) -5.5 / 42);
		test.add((double) 5.5 / 42);
		assertEquals(test, this.calculator.processCalculations());
	}

	/**
	 * Test fure {@link MultiplicationCalculator}
	 */
	@Test
	public void test_MultiplicationCalculator() {
		this.calculator.setCalculatable(new MultiplicationCalculator());
		this.calculator.setModifiert(42);
		List<Double> test = new ArrayList<Double>();
		test.add((double) -1 * 42);
		test.add((double) 0 * 42);
		test.add((double) 1 * 42);
		test.add((double) 123 * 42);
		test.add((double) -123 * 42);
		test.add((double) -5.5 * 42);
		test.add((double) 5.5 * 5);
		assertEquals(test, this.calculator.processCalculations());
	}

	/**
	 * Test fure {@link SubstractionCalculator}
	 */
	@Test
	public void test_SubstractionCalculator() {
		this.calculator.setCalculatable(new SubstractionCalculator());
		this.calculator.setModifiert(42);
		List<Double> test = new ArrayList<Double>();
		test.add((double) -1 - 42);
		test.add((double) 0 - 42);
		test.add((double) 1 - 42);
		test.add((double) 123 - 42);
		test.add((double) -123 - 42);
		test.add((double) -5.5 - 42);
		test.add((double) 5.5 - 5);
		assertEquals(test, this.calculator.processCalculations());
	}
	
	/**
	 * Test fure {@link Calculator#removeValue(double)}
	 */
	@Test
	public void test_removeValue() {
		this.calculator.removeValue(123);
		assertEquals("[-1.0,0.0,1.0,-123.0,-5.5,5.5]", this.calculator.toString());
	}

}
