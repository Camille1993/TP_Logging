package dev;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import dev.utils.*;

@RunWith(Parameterized.class)
public class StringUtilsTest {
	@Parameters
	public static Collection<Object[]> datas () {
		List<Object[]> datas = new ArrayList<Object[]>();
		datas.add(new Object[]{"Chat", "Chateau", 3});
		datas.add(new Object[]{"Saxophone", "Xylophone", 3});
		datas.add(new Object[]{"astrologie", "astronomie", 2});
		datas.add(new Object[]{"phonographe", "aerographe", 4});
		datas.add(new Object[]{"pyrographie", "Pyrotechnie", 6});
		datas.add(new Object[]{"avion", "aviron", 1});
		return datas;

	}
	@Parameter public CharSequence lhs1;
	@Parameter(value =1) public CharSequence rhs1;
	@Parameter(value = 2)public int expected;

	@Test
	public void testLevenshteinDistance() {

		StringUtils stringUtils = new StringUtils();
		@SuppressWarnings("static-access")
		int result = stringUtils.levenshteinDistance(this.lhs1, this.rhs1);
			Assert.assertEquals(expected, result);
	}
			
			
	@SuppressWarnings("static-access")
	@Test(expected = NullPointerException.class)
	public void testLevenshteinDistanceNull() {
		StringUtils stringUtils2 = new StringUtils();
		stringUtils2.levenshteinDistance("film", null);
	}
		


	


}
