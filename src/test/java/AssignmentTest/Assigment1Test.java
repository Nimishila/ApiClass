package AssignmentTest;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assignments.Assignment1;

public class Assigment1Test {
@Test
public void testoccurance()
{
	String str="AA";
	Map<Character,Integer>hashMapexpected=new HashMap<Character,Integer>();
	hashMapexpected.put('A',2);
	Map<Character,Integer>hashMapactual=new HashMap<Character, Integer>();
	hashMapactual=Assignment1.count(str);
	Assert.assertEquals(hashMapexpected, hashMapactual);
}
}
