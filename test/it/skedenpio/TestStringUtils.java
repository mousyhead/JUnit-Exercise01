package it.skedenpio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringUtils {
	
	private String testo;
	private char c;
	
	@Test
	public void testCharCountHelloLSensitive() {
		testo = "HellLo";
		c = 'l';
		boolean isCaseSensitive = true;

		Integer result = StringUtils.charCount(testo,c,isCaseSensitive);		
		
		Integer expected = 2;
		assertEquals("Case sensitive: " + isCaseSensitive + c + " found in " + "\"" + testo + "\"",expected,result);	
	}
	
	@Test
	public void testCharCountHelloLInsensitive() {
		testo = "HellLo";
		c = 'L';
		boolean isCaseSensitive = false;

		Integer result = StringUtils.charCount(testo,c,isCaseSensitive);		
		
		Integer expected = 3;
		assertEquals("Case sensitive: " + isCaseSensitive + c + " found in " + "\"" + testo + "\"",expected,result);	
	}
	
	@Test
	public void testCharCountHelloooWorldO() {
		testo = "Hellooo World";
		c = 'o';

		Integer result = StringUtils.charCount(testo,c);		
		
		Integer expected = 4;
		assertEquals(c + " found in " + "\"" + testo + "\"",expected,result);	
	}
	
	@Test
	public void testZero() {
		testo = "";
		c = 'o';

		Integer result = StringUtils.charCount(testo,c);		
		
		Integer expected = 0;
		assertEquals(c + " found in " + "\"" + testo + "\"",expected,result);	
	}
	
	@Test
	public void testUppercase() {
		testo = "Oh my Darling, oh my Darling! Ooh my Darling!";
		c = 'O';

		Integer result = StringUtils.charCount(testo,c);		
		
		Integer expected = 4;
		assertEquals(c + " found in " + "\"" + testo + "\"",expected,result);	
	}
	

}
