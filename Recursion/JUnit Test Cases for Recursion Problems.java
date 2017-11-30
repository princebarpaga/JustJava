import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveMethodsJUnitTest {

	/* Tests of factorial */
	@Test
	public void test01_fact() {
		RecursiveMethods rm = new RecursiveMethods();
		assertEquals(1, rm.factorial(0));
		assertEquals(1, rm.factorial(1));
		assertEquals(2, rm.factorial(2));
		assertEquals(6, rm.factorial(3));
		assertEquals(24, rm.factorial(4));
		assertEquals(120, rm.factorial(5));
	}

	/* Tests of Fibonacci */
	@Test
	public void test02_fib() {
		RecursiveMethods rm = new RecursiveMethods();
		assertEquals(1, +rm.fib(1));
		assertEquals(1, +rm.fib(2));
		assertEquals(2, +rm.fib(3));
		assertEquals(3, +rm.fib(4));
		assertEquals(5, +rm.fib(5));
		assertEquals(8, +rm.fib(6));
	}

	/* Tests of isPalindrome */
	@Test
	public void test03_palindrome() {
		RecursiveMethods rm = new RecursiveMethods();

		assertTrue(rm.isPalindrome(""));
		assertTrue(rm.isPalindrome("a"));
		assertTrue(rm.isPalindrome("madam"));
		assertTrue(rm.isPalindrome("racecar"));
		assertFalse(rm.isPalindrome("man"));
	}

	/* Tests of reverseOf */
	@Test
	public void test04_isReverse() {

		RecursiveMethods rm = new RecursiveMethods();

		assertEquals("", rm.reverseOf(""));
		assertEquals("a", rm.reverseOf("a"));
		assertEquals("ba", rm.reverseOf("ab"));
		assertEquals("cba", rm.reverseOf("abc"));
		assertEquals("dcba", rm.reverseOf("abcd"));
	}

	/* Tests of occurrencesOf */
	@Test
	public void test05_occurrencesOf() {
		RecursiveMethods rm = new RecursiveMethods();

		assertEquals(0, rm.occurrencesOf("", 'a'));
		assertEquals(1, rm.occurrencesOf("a", 'a'));
		assertEquals(0, rm.occurrencesOf("b", 'a'));
		assertEquals(3, rm.occurrencesOf("baaba", 'a'));
		assertEquals(2, rm.occurrencesOf("baaba", 'b'));
		assertEquals(0, rm.occurrencesOf("baaba", 'c'));
	}

	/* Tests of allPositive */
	@Test
	public void test06_allPositive() {
		RecursiveMethods rm = new RecursiveMethods();

		int[] a1 = {};
		assertTrue(rm.allPositive(a1));
		int[] a2 = { 1, 2, 3, 4, 5 };
		assertTrue(rm.allPositive(a2));
		int[] a3 = { 1, 2, -3, 4, 5 };
		assertFalse(rm.allPositive(a3));
	}

JUnit Test Cases for Recursion Problems	
	
	/* Tests of isSorted */
	@Test
	public void test07_isSorted() {
		RecursiveMethods rm = new RecursiveMethods();

		int[] a4 = {};
		assertTrue(rm.isSorted(a4));
		int[] a5 = { 1, 2, 2, 3, 4 };
		assertTrue(rm.isSorted(a5));
		int[] a6 = { 1, 2, -3, 4, 5 };
		assertFalse(rm.isSorted(a6));
	}

	/* Tests of binarySearch */
	@Test
	public void test08_binarySearch() {
		RecursiveMethods rm = new RecursiveMethods();

		int[] a7 = {};
		assertFalse(rm.binarySearch(a7, 5)); // Search 5 in a7 -> {} False

		int[] a8 = { 1, 2, 3, 4, 5 };
		assertTrue(rm.binarySearch(a8, 3)); // Search 3 in a8 -> {1,2,3,4,5} ->
											// True
		assertTrue(rm.binarySearch(a8, 1)); // Search 1 in a8 -> {1,2,3,4,5} ->
											// True
		assertTrue(rm.binarySearch(a8, 5)); // Search 5 in a8 -> {1,2,3,4,5} ->
											// True
		assertFalse(rm.binarySearch(a8, 0)); // Search 0 in a8 -> {1,2,3,4,5} ->
												// False
		assertFalse(rm.binarySearch(a8, 6)); // Search 6 in a8 -> {1,2,3,4,5} ->
												// False
	}

}
