package golife.com.gojek.utils;

public class StringUtils {

	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(String str) {
		return !StringUtils.isBlank(str);
	}

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

	public static boolean isNotEmpty(String str) {
		return !StringUtils.isEmpty(str);
	}

	public static String trim(String str) {
		return str == null ? null : str.trim();
	}

	public static String trimToNull(String str) {
		String ts = trim(str);
		return isEmpty(ts) ? null : ts;
	}

	public static int indexOf(String str, char searchChar) {
		if (isEmpty(str)) {
			return -1;
		}
		return str.indexOf(searchChar);
	}

	public static String stripExtension (String str) {
		// Handle null case specially.
		if (str == null) return null;
		// Get position of last '.'.
		int pos = str.lastIndexOf(".");
		// If there wasn't any '.' just return the string as is.
		if (pos == -1) return str;
		// Otherwise return the string, up to the dot.
		return str.substring(0, pos);
	}
}
