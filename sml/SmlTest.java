package sml;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * SmlTest class for SML - simple machine language
 * Tests all functions as set out in Assignment One
 * 
 * test.txt is used to test each function individually
 */
public class SmlTest {

	Machine m = new Machine();
	Translator t = new Translator("test.txt");
	
	@Before
	public void setUp() {
		t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
	}
	
	@Test
	public void testAddInstruction() { 
		assertEquals(m.getRegisters().getRegister(3), 15);  // L3 add 3 1 2
	}
	
	@Test
	public void testSubInstruction() { 
		assertEquals(m.getRegisters().getRegister(4), 5);  // L4 sub 4 2 1
	}
	
	@Test
	public void testMulInstruction() { 
		assertEquals(m.getRegisters().getRegister(5), 50);  // L5 mul 5 2 1	
	}
	
	@Test
	public void testDivInstruction() {
		assertEquals(m.getRegisters().getRegister(6), 2);  // L6 div 6 2 1
	}
	
	@Test
	public void testBnzInstruction() { 
		assertEquals(m.getRegisters().getRegister(7), 20); // L8-L10, BnzInstruction works if L9 is skipped
	}
	
	@Test
	public void testLinInstruction() {
		assertEquals(m.getRegisters().getRegister(9), 9999); // L12 lin 9 9999
	}
}
