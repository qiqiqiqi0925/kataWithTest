package test.kata;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.kata.NumbersModified;

public class NumbersModifiedTest {
	
	private NumbersModified toBeTested;
	
	@Before
	public void setUp() throws Exception {
		toBeTested = new NumbersModified(1,100);
	}

	@After
	public void tearDown() throws Exception {
		toBeTested = null;
	}
		
	
	@Test
	public void testDivisibleOf3Foo() {		
		assertEquals("Foo",toBeTested.divisible357(3));
	}
	
	@Test
	public void testDivisibleOf5Bar() {		
		assertEquals("Bar",toBeTested.divisible357(5));
	}
	
	@Test
	public void testDivisibleOf7Qix() {		
		assertEquals("Qix",toBeTested.divisible357(7));
	}
	
	@Test
	public void testContainsOf3Foo() {		
		assertEquals("Foo",toBeTested.contains357(3));
	}
	
	@Test
	public void testContainsOf5Bar() {		
		assertEquals("Bar",toBeTested.contains357(5));
	}
	
	@Test
	public void testContainsOf7Qix() {		
		assertEquals("Qix",toBeTested.contains357(7));
	}
	
	@Test
	public void testContainsOf33Foo() {		
		assertEquals("FooFoo",toBeTested.contains357(33));
	}
	
	@Test
	public void testContainsOf55Bar() {		
		assertEquals("BarBar",toBeTested.contains357(55));
	}
	
	@Test
	public void testContainsOf77Qix() {		
		assertEquals("QixQix",toBeTested.contains357(77));
	}
	
	@Test
	public void testContainsOf35Foo() {		
		assertEquals("FooBar",toBeTested.contains357(35));
	}
	
	@Test
	public void testContainsOf57Bar() {		
		assertEquals("BarQix",toBeTested.contains357(57));
	}
	
	@Test
	public void testContainsOf37Qix() {		
		assertEquals("FooQix",toBeTested.contains357(37));
	}
	
	
	@Test
	public void testDivisibleOf3nFoo() {		
		Random rand3 = new Random();
		int i = rand3.nextInt(33); 
		assertTrue(toBeTested.divisible357(i*3).contains("Foo"));
	}
	
	@Test
	public void testDivisibleOf5nBar() {		
		Random rand5 = new Random();
		int i = rand5.nextInt(20); 
		assertTrue(toBeTested.divisible357(i*5).contains("Bar"));
	}
	
	@Test
	public void testDivisibleOf7nQix() {		
		Random rand7 = new Random();
		int i = rand7.nextInt(14); 
		assertTrue(toBeTested.divisible357(i*7).contains("Qix"));
	}

	
	@Test
	public void testContainsOfX3Foo() {		
		Random rand3 = new Random();
		int i = rand3.nextInt(10); 
		assertTrue(toBeTested.contains357(i*10+3).contains("Foo"));
	}
	
	@Test
	public void testContainsOfX5Bar() {		
		Random rand5 = new Random();
		int i = rand5.nextInt(10); 
		assertTrue(toBeTested.contains357(i*10+5).contains("Bar"));
	}
	
	@Test
	public void testContainsOfX7Qix() {		
		Random rand7 = new Random();
		int i = rand7.nextInt(10); 
		assertTrue(toBeTested.contains357(i*10+7).contains("Qix"));
	}
	
	@Test
	public void testContainsOf3XFoo() {		
		Random rand3 = new Random();
		int i = rand3.nextInt(10); 
		assertTrue(toBeTested.contains357(i+30).contains("Foo"));
	}
	
	@Test
	public void testContainsOf5XBar() {		
		Random rand5 = new Random();
		int i = rand5.nextInt(10); 
		assertTrue(toBeTested.contains357(i+50).contains("Bar"));
	}
	
	@Test
	public void testContainsOf7XQix() {		
		Random rand7 = new Random();
		int i = rand7.nextInt(10); 
		assertTrue(toBeTested.contains357(i+70).contains("Qix"));
	}
	
	@Test
	public void testPrintNumberModifiedOf53BarFoo() {
		assertEquals("BarFoo",toBeTested.printNumberModified(53));
	}
	
	@Test
	public void testPrintNumberModifiedOf13Foo() {
		assertEquals("Foo",toBeTested.printNumberModified(13));
	}
	
	@Test
	public void testPrintNumberModifiedOf15FooBarBar() {
		assertEquals("FooBarBar",toBeTested.printNumberModified(15));
	}
	
	@Test
	public void testPrintNumberModifiedOf33FooFooFoo() {
		assertEquals("FooFooFoo",toBeTested.printNumberModified(33));
	}
	
	@Test
	public void testPrintAll100() {
		assertEquals(100,toBeTested.printAll().size());
	}
	
}
