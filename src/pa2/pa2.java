package pa2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class pa2 {

	public static void main(String[] args) {

		System.out.println(espanol());
		
		List<String> liftList = new ArrayList<String>();
		liftList.add("Hi");
		liftList.add("Mom!");
		System.out.println(liftList);
		System.out.println(lift(liftList));
		
		Map<String, String> takeItAwayMap = new HashMap<String, String>();
		takeItAwayMap.put("Pea","Green");
		takeItAwayMap.put("Cherry","Red");
		takeItAwayMap.put("Plumb","Purple");
		System.out.println(takeItAwayMap);
		String input = "Cherry";
		boolean trueFalse = takeItAway(takeItAwayMap, input);
		System.out.println(trueFalse);
		
		LinkedList<Double> linkedList = new LinkedList<Double>();  
		linkedList.add(1.50);  
		linkedList.add(2.25);  
		linkedList.add(3.75); 
		double dub = 4.00;
		System.out.println(linkedList);
		System.out.println(prependValue(linkedList, dub));
		
		List<String> toSet = new ArrayList<>();
		toSet.add("hello");  
		toSet.add("hola"); 
		toSet.add("hi"); 
		toSet.add("hello"); 
		System.out.println(toSet);
		System.out.println(listToSet(toSet));
		
		String one = "1";
		String two = "2";
		String three = "blah";
		System.out.println(catchThis(one, two, three));
	}
	
	public static Map<Integer, String> espanol ()
	{
		Map<Integer, String> espanolMap = new HashMap<Integer, String>();
		espanolMap.put(1,"Uno");
		espanolMap.put(2,"Dos");
		espanolMap.put(3,"Tres");
		return espanolMap;
	}
	
	public static int lift (List<String> a)
	{
		a.replaceAll(String::toUpperCase);
		int legnth = a.size();
		System.out.println(a);
		return legnth;
	}
	
	public static boolean takeItAway (Map<String,String> map, String a)
	{
		boolean trueFalse;
		if (map.containsKey(a))
		{
			trueFalse = true;
			map.remove(a);
			System.out.println(map);
		}
		else 
		{
			trueFalse = false;
			System.out.println(map);
		}
		return trueFalse;
	}
	
	public static LinkedList<Double> prependValue (LinkedList<Double> a, double b)
	{
		a.addFirst(b);
		return a;
	}
	
	public static  Set<String>  listToSet (List<String> a)
	{
		Set<String> setStrings = Set.copyOf(a);
		return setStrings;
	}
	
	public static int catchThis (String a, String b, String c)
	{
		try 
		{	
			int i=Integer.parseInt(a);  
			int j=Integer.parseInt(b);  
			int k=Integer.parseInt(c); 
			int total = i + j + k;
			return total;
		}
		catch (NumberFormatException e)
		{
			int total = 0;
			return total;
		}
	}
}