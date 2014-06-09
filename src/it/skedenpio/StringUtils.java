package it.skedenpio;


public class StringUtils {

	public static Integer charCount(String string, char c) {
		return charCount(string, c, false);
	}
	
	public static Integer charCount(String string, char c, boolean isCaseSensitive) {
		Integer found = 0;

		for (int i = 0; i < string.length(); i++) {
			if (isCaseSensitive) {
				if (string.charAt(i) == c) {
					found++;
				}
			} else {
				if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(c)) {
					found++;
				}
			}
		}
		
		return found;
	}

}
