package pa2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class pa2tests {

	@Test
	void prependValue() 
	{
		LinkedList<Double> list = new LinkedList<Double>();  
		list.add(1.50);  
		list.add(2.25);  
		list.add(3.75); 
		double dub = 4.00;
		pa2.prependValue(list, dub);
		assertEquals(4, list.size());
	}

	@Test
	void prependValue2() 
	{
		LinkedList<Double> list = new LinkedList<Double>();  
		list.add(1.50);  
		list.add(2.25);  
		list.add(3.75); 
		double dub = 4.00;
		pa2.prependValue(list, dub);
		assertEquals(4.00, list.get(0));
	}
	
	@Test
	void catchThis()
	{
		String one = "3";
		String two = "blah";
		String three = "2";
		
		assertEquals(0, pa2.catchThis(one,two,three));
	}
	
	@Test
	void catchThis2()
	{
		String one = "3";
		String two = "9";
		String three = "2";
		
		assertEquals(14, pa2.catchThis(one,two,three));
	}
	
	@Test
	void catchThis3()
	{
		String one = "-2";
		String two = "-4";
		String three = "-7";
		
		assertEquals(-13, pa2.catchThis(one,two,three));
	}
	
	@Test
	void catchThis4()
	{
		String one = "-5";
		String two = "11";
		String three = "-2";
		
		assertEquals(4, pa2.catchThis(one,two,three));
	}

		@Test
		void returnsAMap() {
			Map<Integer,String> map = pa2.espanol();
			assertTrue(map instanceof Map);
		}
		
		@Test
		void returnsAMapOfSpanishNumbers() {
			Map<Integer,String> map = pa2.espanol();
			assertEquals("Uno", map.get(1));
			assertEquals("Dos", map.get(2));
			assertEquals("Tres", map.get(3));
			assertEquals(3, map.size());
		}


		@Test
		void capitalizes() {
			List<String> words = new ArrayList<>(Arrays.asList("Hi", "mom!"));
			pa2.lift(words);
			assertArrayEquals(new String[] { "HI", "MOM!" }, words.toArray());
		}
		
		@Test
		void capitalizes2() {
			List<String> words = new ArrayList<>(Arrays.asList("grand", "cIrcUS", "4", "ThE", "WIN!!"));
			pa2.lift(words);
			assertArrayEquals(new String[] { "GRAND", "CIRCUS", "4", "THE", "WIN!!" }, words.toArray());
		}
		
		@Test
		void returnsLength2() {
			List<String> words = new ArrayList<>(Arrays.asList("Hi", "mom!"));
			assertEquals(2, pa2.lift(words));
		}
		
		@Test
		void returnsLength3() {
			List<String> words = new ArrayList<>(Arrays.asList("A", "b", "C"));
			assertEquals(3, pa2.lift(words));
		}
		
		@Test
		void returnsLength0() {
			List<String> words = new ArrayList<>();
			assertEquals(0, pa2.lift(words));
		}


		@Test
		void convertsListToSet() {
			List<String> list = new ArrayList<>(Arrays.asList("Apple", "Berry"));
			Set<String> set = pa2.listToSet(list);
			assertEquals(new HashSet<>(Arrays.asList("Apple", "Berry")), set);
		}

		@Test
		void convertsListToSet2() {
			List<String> list = new ArrayList<>(Arrays.asList("Apple", "Berry", "Apple", "Celery"));
			Set<String> set = pa2.listToSet(list);
			assertEquals(new HashSet<>(Arrays.asList("Apple", "Berry", "Celery")), set);
		}

		@Test
		void convertsEmptyListToSet() {
			List<String> list = new ArrayList<>(0);
			Set<String> set = pa2.listToSet(list);
			assertEquals(new HashSet<>(), set);
		}

}