package comp5111.assignment.cut;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Subject {

	public class TaskHandler{
		
		private static final char NESTED = '.', MAPPED_START = '(', MAPPED_END = ')', INDEXED_START = '[', INDEXED_END = ']';

		/**
		 * Retrieves the index value from the provided property exp, or returns -1 if the property is not indexed.
		 *
		 * @param exp the exp to be evaluated
		 * @return the index value extracted from the exp, or -1 if the property is not indexed, or -10086 if error
		 */
		public int getIndex(final String exp) {
			if (exp == null || exp.isEmpty()) {
					return -1;
			}
			for (int i = 0; i < exp.length(); i++) {
				final char c = exp.charAt(i);
				if (c == NESTED || c == MAPPED_START) {
					return -1;
				}
				if (c == INDEXED_START) {
					final int end = exp.indexOf(INDEXED_END, i);
					if (end < 0) {
						throw new IllegalArgumentException("Missing End Delimiter");
					}
					final String value = exp.substring(i + 1, end);
					if (value.isEmpty()) {
						throw new IllegalArgumentException("No Index Value");
					}
					int index = 0;
					if (Pattern.compile("-?\\d+(\\.\\d+)?").matcher(value).matches())
						index = Integer.parseInt(value, 10);
					else return -10086;
					return index;
				}
			}
			return -10086;
		}

		/**
		 * Retrieves the map key from the provided property exp, or returns {@code null}.
		 *
		 * @param exp the exp to be evaluated
		 * @return the extracted map key from the exp, or {@code null} if no map key is found
		 */
		public String getKey(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return null;
			}
			for (int i = 0; i < exp.length(); i++) {
			final char c = exp.charAt(i);
			if (c == NESTED || c == INDEXED_START) {
				return null;
			}
			if (c == MAPPED_START) {
			final int end = exp.indexOf(MAPPED_END, i);
				if (end < 0) {
					throw new IllegalArgumentException("Missing End Delimiter");
				}
				return exp.substring(i + 1, end);
			}
			}
			return null;
		}

		/**
		 * Extracts the property name from the provided property exp.
		 *
		 * @param exp the exp to be evaluated
		 * @return the extracted property name from the exp
		 */
		public String getProperty(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return exp;
			}
			for (int i = 0; i < exp.length(); i++) {
				final char c = exp.charAt(i);
				if ((c == NESTED) || (c == MAPPED_START || c == INDEXED_START)) {
					return exp.substring(0, i);
				}
			}
			return exp;
		}

		/**
		 * Determines if the exp contains nested property exps.
		 *
		 * @param exp the exp to be evaluated
		 * @return true if the exp contains nested property exps, false otherwise
		 */
		public boolean hasNested(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return false;
			}
			return remove(exp) != null;
		}

		/**
		 * Determines if the exp corresponds to an indexed property.
		 *
		 * @param exp the exp to be evaluated
		 * @return true if the exp represents an indexed property, false otherwise
		 */
		public boolean isIndexed(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return false;
			}
			for (int i = 0; i < exp.length(); i++) {
				final char c = exp.charAt(i);
				if (c == NESTED || c == MAPPED_START) {
					return false;
				}
				if (c == INDEXED_START) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Determines if the exp corresponds to a mapped property.
		 *
		 * @param exp the exp to be evaluated
		 * @return true if the exp represents a mapped property, false otherwise
		 */
		public boolean isMapped(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return false;
			}
			for (int i = 0; i < exp.length(); i++) {
				final char c = exp.charAt(i);
				if (c == NESTED || c == INDEXED_START) {
					return false;
				}
				if (c == MAPPED_START) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Extracts the next property exp from the given exp.
		 *
		 * @param exp the exp to be evaluated
		 * @return the next property exp extracted from the exp
		 */
		public String findNext(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return null;
			}
			boolean indexed = false;
			boolean mapped	= false;
			for (int i = 0; i < exp.length(); i++) {
				final char c = exp.charAt(i);
				if (indexed) {
					if (c == INDEXED_END) {
						return exp.substring(0, i + 1);
					}
				} else if (mapped) {
					if (c == MAPPED_END) {
						return exp.substring(0, i + 1);
					}
				} else {
					if (c == NESTED) {
						return exp.substring(0, i);
					} else if (c == MAPPED_START) {
						mapped = true;
					} else if (c == INDEXED_START) {
						indexed = true;
					}
				}
			}
			return exp;
		}

		/**
		 * Removes the last property exp from the given exp.
		 *
		 * @param exp the exp to be evaluated
		 * @return the new exp value with the first property exp removed, or null if there are no more exps
		 */
		public String remove(final String exp) {
			if (exp == null || exp.isEmpty()) {
				return null;
			}
			final String property = findNext(exp);
			if (exp.length() == property.length()) {
				return null;
			}
			int start = property.length();
			if (exp.charAt(start) == NESTED) {
				start++;
			}
			return exp.substring(start);
		}
	}

	public class TextHandler {
		
		/**
		 * Creates a new TextBuffer with more than one slot and allocates a char[] with the specified bufferSize.
		 */
		public char[] newTextBuffer(final int bufferSize) {
			if (bufferSize < 1) {
//				System.out.println("error.");
				return null;
			}
			return new char[bufferSize];
		}
	
		/**
		 * Converts each Unicode code point, starting at the given offset, to lowercase.
		 */
		public char[] toLowerCase(final char[] buffer, final int offset, final int limit) {
			if (buffer == null || !(buffer.length >= limit && 0 <= offset && offset <= buffer.length)) {
//				System.out.println("error.");
				return null;
			}
			for (int i = offset; i < limit; ) {
				i += Character.toChars(
						Character.toLowerCase(Character.codePointAt(buffer, i, limit)), buffer, i);
			}
			return buffer;
		}
	
		/**
		* Converts each Unicode code point, starting at the given offset, to uppercase.
		*/
		public char[] toUpperCase(final char[] buffer, final int offset, final int limit) {
			if (!(buffer.length >= limit && 0 <= offset && offset <= buffer.length)) {
//				System.out.println("error.");
				return null;
			}
			for (int i = offset; i < limit; ) {
				i += Character.toChars(
								Character.toUpperCase(Character.codePointAt(buffer, i, limit)), buffer, i);
			}
			return buffer;
		}
	
		public char[] string2char(final String str) {
	        return str.toCharArray();
	    }
		
		/**
		 * Worker method for escapeJavaScript(String) method.
		 */
		public String escapeJavaStyleString(String str, boolean escapeSingleQuote, boolean escapeForwardSlash) {
			if (str == null) {
				return null;
			}
			String res = "";
			int sz;
			sz = str.length();
			for (int i = 0; i < sz; i++) {
				char ch = str.charAt(i);

				// handle unicode
				if (ch > 0xfff) {
					res += ("\\u" + hex(ch));
				} else if (ch > 0xff) {
					res += ("\\u0" + hex(ch));
				} else if (ch > 0x7f) {
					res += ("\\u00" + hex(ch));
				} else if (ch < 32) {
					if (ch  == '\b') {
						res += ('\\');
						res += ('b'); }
					else if (ch  == '\n') {
						res += ('\\');
						res += ('n'); }
					else if (ch  == '\t') {
						res += ('\\');
						res += ('t'); }
					else if (ch  == '\f') {
						res += ('\\');
						res += ('f'); }
					else if (ch  == '\r') {
						res += ('\\');
						res += ('r');
					} else {
						if (ch > 0xf) res += ("\\u00" + hex(ch));
						else res += ("\\u000" + hex(ch));
					}
				} else {
					if (ch  == '\'') {
						if (escapeSingleQuote)
							res += ('\\');
						res += ('\''); }
					else if (ch  == '"') {
						res += ('\\');
						res += ('"'); }
					else if (ch  == '\\') {
						res += ('\\');
						res += ('\\'); }
					else if (ch  == '/') {
						if (escapeForwardSlash)
							res += ('\\');
						res += ('/'); }
					else
						res += (ch);
				}
			}
			return res;
		}

		/**
		 * Returns an uppercase hexadecimal string representation of the given character.
		 */
		private String hex(char ch) {
			return Integer.toHexString(ch).toUpperCase(Locale.ENGLISH);
		}

		/**
		 * Reverses the process of escaping Java literals in a string.
		 * For example, it converts a sequence of '\\' and 'n' back
		 * to a newline character, unless the '\\' is preceded by another '\\'.
		 */
		public String unescapeJava(String str) {
			if (str == null) {
				return null;
			}
			String res = "";
			int sz = str.length();
			StringBuilder unicode = new StringBuilder();
			boolean hadSlash = false;
			boolean inUnicode = false;

			for (int i = 0; i < sz; i++) {
				char ch = str.charAt(i);
				if (inUnicode) {
					unicode.append(ch);
					if (unicode.length() == 4) {
						int value = Integer.parseInt(unicode.toString(), 16);
						res += ((char) value);
						unicode.setLength(0);
						inUnicode = false;
						hadSlash = false;
					}
					continue;
				}
				if (hadSlash) {
					// for escaped value
					hadSlash = false;
					if (ch == '\\') {
						res += ('\\');
					} else if (ch == '\'') {
						res += ('\'');
					} else if (ch == '\"') {
						res += ('"');
					} else if (ch == 'r') {
						res += ('\r');
					} else if (ch == 'f') {
						res += ('\f');
					} else if (ch == 't') {
						res += ('\t');
					} else if (ch == 'n') {
						res += ('\n');
					} else if (ch == 'b') {
						res += ('\b');
					} else if (ch == 'u') {
						inUnicode = true;
					} else {
						res += (ch);
					}
					continue;
				} else if (ch == '\\') {
					hadSlash = true;
					continue;
				}
				res += (ch);
			}
			if (hadSlash) {
				res += ('\\');
			}
			return res;
		}
	}
	
	public class ParameterHandler {
		
		/** The string to be parsed. */
		private char[] chars = null;
		/** The current position in the string. */
		private int pos = 0;
		/** The maximum position in the string. */
		private int len = 0;
		/** The start of a token. */
		private int i1 = 0;
		/** The end of a token. */
		private int i2 = 0;

		/** Indicates whether names stored in the map should be converted to lower case. */
		private boolean lowerCaseNames = false;

		/**
		 * Checks if there are any unparsed characters remaining.
		 *
		 * @return true if there are unparsed characters, false otherwise
		 */
		private boolean hasChar() {
			return this.pos < this.len;
		}

		/**
		 * Processes the parsed token by removing leading and trailing blanks, as well as enclosing quotation marks if necessary.
		 *
		 * @param quoted indicates whether quotation marks are expected
		 * @return the processed token
		 */
		private String getToken(boolean quoted) {
			// Remove the leading white spaces
			while ((i1 < i2) && (Character.isWhitespace(chars[i1]))) {
				i1++;
			}
			// Remove the trailing white spaces
			while ((i2 > i1) && (Character.isWhitespace(chars[i2 - 1]))) {
				i2--;
			}
			// Remove quotation marks if necessary
			if (quoted && ((i2 - i1) >= 2) && (chars[i1] == '"') && (chars[i2 - 1] == '"')) {
				i1++;
				i2--;
			}
			String result = null;
			if (i2 > i1) {
				result = new String(chars, i1, i2 - 1);
			}
			return result;
		}

		/**
		 * Determines whether the specified character is found within the provided array of characters.
		 *
		 * @param ch the character to check for presence in the array
		 * @param charray the array of characters to search within
		 * @return true if the character is found in the array, otherwise false
		 */
		private boolean isOneOf(char ch, final char[] charray) {
			boolean result = false;
			for (char element : charray) {
				if (ch == element) {
					result = true;
					break;
				}
			}
			return result;
		}

		/**
		 * Parses a token until any of the specified terminator characters is encountered.
		 *
		 * @param terminators the array of terminating characters
		 * @return the parsed token
		 */
		private String parseToken(final char[] terminators) {
			char ch;
			i1 = pos;
			i2 = pos;
			while (hasChar()) {
				ch = chars[pos];
				if (isOneOf(ch, terminators)) {
					break;
				}
				i2++;
				pos++;
			}
			return getToken(false);
		}

		/**
		 * Parses a token until any of the specified terminator characters is encountered outside the quotation marks.
		 *
		 * @param terminators the array of terminating characters
		 * @return the parsed token
		 */
		private String parseQuotedToken(final char[] terminators) {
			char ch;
			i1 = pos;
			i2 = pos;
			boolean quoted = false;
			boolean charEscaped = false;
			while (hasChar()) {
				ch = chars[pos];
				if (!quoted && isOneOf(ch, terminators)) {
					break;
				}
				if (!charEscaped && ch == '"') {
					quoted = !quoted;
				}
				charEscaped = (!charEscaped && ch == '\\');
				i2++;
				pos++;
			}
			return getToken(true);
		}

		/**
		 * Parses a string to extract a map of name/value pairs.
		 *
		 * @param str the string containing a sequence of name/value pairs
		 * @param separators the separators used to separate the name/value pairs
		 * @return a map of name/value pairs
		 */
		public Map<String, String> parse(final String str, char[] separators) {
			if (separators == null || separators.length == 0) {
				return new HashMap<>();
			}
			char separator = separators[0];
			if (str != null) {
				int idx = str.length();
				for (char separator2 : separators) {
					int tmp = str.indexOf(separator2);
					if (tmp != -1 && tmp < idx) {
						idx = tmp;
						separator = separator2;
					}
				}
			}
			return parse(str, separator);
		}

		/**
		 * Parses a string to extract a map of name/value pairs.
		 *
		 * @param str the string containing a sequence of name/value pairs
		 * @param separator the separator used to separate the name/value pairs
		 * @return a map of name/value pairs
		 */
		public Map<String, String> parse(final String str, char separator) {
			if (str == null) {
				return new HashMap<>();
			}
			return parse(str.toCharArray(), separator);
		}

		/**
		 * Parses a string to extract a map of name/value pairs.
		 *
		 * @param charArray an array of characters that includes a sequence of name/value pairs
		 * @param separator the separator used to differentiate the name/value pairs
		 * @return a map of name/value pairs
		 */
		public Map<String, String> parse(final char[] charArray, char separator) {
			if (charArray == null) {
				return new HashMap<>();
			}
			return parse(charArray, 0, charArray.length, separator);
		}

		/**
		 * Parses a string to extract a map of name/value pairs.
		 *
		 * @param charArray the array of characters containing a sequence of name/value pairs
		 * @param offset the initial offset
		 * @param length the length of the portion to be parsed
		 * @param separator the separator used to separate the name/value pairs
		 * @return a map of name/value pairs
		 */
		public Map<String, String> parse(final char[] charArray, int offset, int length, char separator) {
			if (charArray == null) {
				return new HashMap<>();
			}
			HashMap<String, String> params = new HashMap<>();
			this.chars = charArray;
			this.pos = offset;
			this.len = length > charArray.length ? charArray.length : length;
			String paramName = null;
			String paramValue = null;
			while (hasChar()) {
				paramName = parseToken(new char[] { '=', separator });
				paramValue = null;
				if (hasChar() && (charArray[pos] == '=')) {
					pos++; // skip '='
					paramValue = parseQuotedToken(new char[] { separator });
				}
				if (hasChar() && (charArray[pos] == separator)) {
					pos++; // skip separator
				}
				if ((paramName != null) && (paramName.length() > 0)) {
					if (this.lowerCaseNames) {
						paramName = paramName.toLowerCase(Locale.ENGLISH);
					}
					params.put(paramName, paramValue);
				}
			}
			return params;
		}
		
		/**
		 * Converts an integer value to a Boolean object based on specified true, false, and null values.
		 *
		 * @param value      the integer value to convert
		 * @param trueValue  the value representing true
		 * @param falseValue the value representing false
		 * @param nullValue  the value representing null
		 * @return the corresponding Boolean object or null if the value matches nullValue
		 * @throws IllegalArgumentException if the value does not match any of the specified values
		 */
		public Boolean toBooleanObject(int value, int trueValue, int falseValue, int nullValue) {
			if (value == trueValue) {
				return Boolean.TRUE;
			} else if (value == falseValue) {
				return Boolean.FALSE;
			} else if (value == nullValue) {
				return null;
			}
			throw new IllegalArgumentException("No match.");
		}

		/**
		 * Converts an Integer object to a Boolean object based on specified true, false, and null values.
		 *
		 * @param value      the Integer object to convert
		 * @param trueValue  the value representing true
		 * @param falseValue the value representing false
		 * @param nullValue  the value representing null
		 * @return the corresponding Boolean object or null if the value matches nullValue
		 * @throws IllegalArgumentException if the value does not match any of the specified values
		 */
		public Boolean toBooleanObject(Integer value, Integer trueValue, Integer falseValue, Integer nullValue) {
			if (value == null) {
				if (trueValue == null) {
					return Boolean.TRUE;
				} else if (falseValue == null) {
					return Boolean.FALSE;
				} else if (nullValue == null) {
					return null;
				}
			} else if (value.equals(trueValue)) {
				return Boolean.TRUE;
			} else if (value.equals(falseValue)) {
				return Boolean.FALSE;
			} else if (value.equals(nullValue)) {
				return null;
			}
			throw new IllegalArgumentException("No match.");
		}
		
		/**
		 * Converts a string to a Boolean object. Supported: yes/no, on/off, true/false.
		 *
		 * @param str the string to convert
		 * @return the corresponding Boolean object or null if the string does not represent a valid boolean value
		 */
		public Boolean toBooleanObject(String str) {
			if (str == null) {
				return null;
			}
			if ("true".equals(str)) {
				return Boolean.TRUE;
			}
			if (str.length() == 1) {
				char ch0 = str.charAt(0);
				if ((ch0 == 'y' || ch0 == 'Y') || (ch0 == 't' || ch0 == 'T')) {
					return Boolean.TRUE;
				}
				if ((ch0 == 'n' || ch0 == 'N') || (ch0 == 'f' || ch0 == 'F')) {
					return Boolean.FALSE;
				}
			}
			else if (str.length() == 2) {
				char ch0 = str.charAt(0);
				char ch1 = str.charAt(1);
				if ((ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N')) {
					return Boolean.TRUE;
				}
				if ((ch0 == 'n' || ch0 == 'N') && (ch1 == 'o' || ch1 == 'O')) {
					return Boolean.FALSE;
				}
			}
			else if (str.length() == 3) {
				char ch0 = str.charAt(0);
				char ch1 = str.charAt(1);
				char ch2 = str.charAt(2);
				if ((ch0 == 'y' || ch0 == 'Y') && (ch1 == 'e' || ch1 == 'E') && (ch2 == 's' || ch2 == 'S')) {
					return Boolean.TRUE;
				}
				if ((ch0 == 'o' || ch0 == 'O') && (ch1 == 'f' || ch1 == 'F') && (ch2 == 'f' || ch2 == 'F')) {
					return Boolean.FALSE;
				}
			}
			else if (str.length() == 4) { 
				char ch0 = str.charAt(0);
				char ch1 = str.charAt(1);
				char ch2 = str.charAt(2);
				char ch3 = str.charAt(3);
				if ((ch0 == 't' || ch0 == 'T') && (ch1 == 'r' || ch1 == 'R') && (ch2 == 'u' || ch2 == 'U') && (ch3 == 'e' || ch3 == 'E')) {
					return Boolean.TRUE;
				}
			}
			else if (str.length() == 5) { 
				char ch0 = str.charAt(0);
				char ch1 = str.charAt(1);
				char ch2 = str.charAt(2);
				char ch3 = str.charAt(3);
				char ch4 = str.charAt(4);
				if ((ch0 == 'f' || ch0 == 'F') && (ch1 == 'a' || ch1 == 'A') && (ch2 == 'l' || ch2 == 'L') && (ch3 == 's' || ch3 == 'S') && (ch4 == 'e' || ch4 == 'E')) {
					return Boolean.FALSE;
				}
			}
			return null;
		}

		/**
		 * Converts a string to a Boolean object based on specified true, false, and null strings.
		 *
		 * @param str         the string to convert
		 * @param trueString  the string representing true
		 * @param falseString the string representing false
		 * @param nullString  the string representing null
		 * @return the corresponding Boolean object or null if the string matches nullString
		 * @throws IllegalArgumentException if the string does not match any of the specified strings
		 */
		public Boolean toBooleanObject(String str, String trueString, String falseString, String nullString) {
			if (str == null) {
				if (trueString == null) {
					return Boolean.TRUE;
				} else if (falseString == null) {
					return Boolean.FALSE;
				} else if (nullString == null) {
					return null;
				}
			} else if (str.equals(trueString)) {
				return Boolean.TRUE;
			} else if (str.equals(falseString)) {
				return Boolean.FALSE;
			} else if (str.equals(nullString)) {
				return null;
			}
			throw new IllegalArgumentException("No match.");
		}

		/**
		 * Determines if the given boolean array has one element with a value of {@code true}.
		 *
		 * @param array the array of boolean values
		 * @return true if there is exactly one true value in the array, false otherwise
		 */
		public boolean hasOneTrue(boolean[] array) {
			if (array == null) {
				return false;
			}
			int trueCount = -1;
			for (int i = 0; i < array.length; i++) {
				if (array[i]) {
					if (trueCount < 1) { 
						trueCount++;
					} else {
						return false;
					}
				}
			}
			return trueCount > 0;
		}
	}
	
	public class NumberHandler {
		
		/**
		 * Converts a string value to a Number.
		 *
		 * The method examines the value for a type qualifier at the end ('f', 'F', 'd', 'D', 'l', 'L').
		 * If a qualifier is found, it attempts to create successively larger number types until it finds
		 * one that can accommodate the value.
		 *
		 * If no type specifier is found, the method checks for a decimal point and then tries successively
		 * larger number types from Integer to BigInteger, and from Float to BigDecimal. If the string starts
		 * with "0x" or "-0x", it is interpreted as a hexadecimal integer. Values with leading zeros will not 
		 * be interpreted as octal.
		 *
		 * @param val the string containing a number
		 * @return the Number created from the string
		 */
		public Number parseNumber(String val) {
			if (val == null || val.length() == 0 || (val.length() == 1 && !Character.isDigit(val.charAt(0)))) {
				return null;
			}
			if (val.startsWith("--")) {
				return null;
			}
			if (val.startsWith("0x") || val.startsWith("-0x")) {
				return Integer.decode(val);
			}
			char lastChar = val.charAt(val.length() - 1);
			String mant;
			String dec;
			String exp;
			int decPos = val.indexOf('.');
			int expPos = val.indexOf('e') + val.indexOf('E') + 1;
			if (decPos > -1) {
				if (expPos > -1) {
					if (expPos < decPos) {
						throw new NumberFormatException(val + " is not a valid number.");
					}
					dec = val.substring(decPos + 1, expPos);
				} else dec = val.substring(decPos + 1);
				mant = val.substring(0, decPos);
			} else {
				if (expPos > -1) {
					mant = val.substring(0, expPos);
				} else mant = val;
				dec = null;
			}
			if (!Character.isDigit(lastChar)) {
				if (expPos > -1 && expPos < val.length() - 1) {
					exp = val.substring(expPos + 1, val.length() - 1);
				} else exp = null;
				String numeric = val.substring(0, val.length() - 1);
				
				if (lastChar == 'l' || lastChar == 'L') {
					if (dec == null && exp == null && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric))) {
						BigInteger res = new BigInteger(numeric);
						if (res == BigInteger.valueOf(res.intValue()))
							return res.intValue();
						if (res == BigInteger.valueOf(res.longValue()))
							return res.longValue();
						return res;
					}
					throw new NumberFormatException(val + " is not a valid number.");
				} else if (lastChar == 'f' || lastChar == 'F') {
					return Float.valueOf(numeric);
				} else if (lastChar == 'd' || lastChar == 'D') {
					BigDecimal res = new BigDecimal(numeric);
					if (res == BigDecimal.valueOf(res.doubleValue()))
						return res.doubleValue();
					return res;
				} else {
					throw new NumberFormatException(val + " is not a number.");
				}
			} else {
				if (expPos > -1 && expPos < val.length() - 1)
					exp = val.substring(expPos + 1);
				else exp = null;
				if (dec == null && exp == null) {
					// Should be int,long,bigint
					BigInteger res = new BigInteger(val);
					if (res == BigInteger.valueOf(res.intValue()))
						return res.intValue();
					if (res == BigInteger.valueOf(res.longValue()))
						return res.longValue();
					return res;
				} else {
					// Should be float,double,BigDec
					BigDecimal res = new BigDecimal(val);
					if (res == BigDecimal.valueOf(res.floatValue()))
						return res.floatValue();
					if (res == BigDecimal.valueOf(res.doubleValue()))
						return res.doubleValue();
					return res;
				}
			}
		}

		/**
		 * Checks whether the String contains only digit characters.
		 *
		 * Null and empty String will return false.
		 *
		 * @param str the String to check
		 * @return true if str contains only Unicode numeric characters, false otherwise
		 */
		public boolean isDigits(String str) {
			if ((str == null) || (str.length() == 0)) {
				return false;
			}
			for (int i = 0; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					return false;
				}
			}
			return true;
		}

		/**
		 * Retrieves the minimum value among three long values.
		 *
		 * @param a the first value
		 * @param b the second value
		 * @param c the third value
		 * @return the smallest value among the three
		 */
		public long minimum(long a, long b, long c) {
			if (b < a) {
				a = b;
			}
			if (c < a) {
				a = c;
			}
			return a;
		}

		/**
		 * Retrieves the minimum value among three int values.
		 *
		 * @param a the first value
		 * @param b the second value
		 * @param c the third value
		 * @return the smallest value among the three
		 */
		public int minimum(int a, int b, int c) {
			if (b < a) {
				a = b;
			}
			if (c < a) {
				a = c;
			}
			return a;
		}

		/**
		 * Retrieves the maximum value among three long values.
		 *
		 * @param a the first value
		 * @param b the second value
		 * @param c the third value
		 * @return the largest value among the three
		 */
		public long maximum(long a, long b, long c) {
			if (b > a) {
				a = b;
			}
			if (c > a) {
				a = c;
			}
			return a;
		}

		/**
		 * Retrieves the maximum value among three int values.
		 *
		 * @param a the first value
		 * @param b the second value
		 * @param c the third value
		 * @return the largest value among the three
		 */
		public int maximum(int a, int b, int c) {
			if (b > a) {
				a = b;
			}
			if (c > a) {
				a = c;
			}
			return a;
		}

		/**
		 * Compares two doubles for order.
		 *
		 * @param lhs the first double value
		 * @param rhs the second double value
		 * @return -1 if lhs is less than rhs, +1 if lhs is greater than rhs,
		 *         0 if lhs is equal to rhs
		 */
		public int compare(double lhs, double rhs) {
			if (lhs < rhs) {
				return -1;
			}
			if (lhs > rhs) {
				return +1;
			}
			
			long lhsBits = Double.doubleToLongBits(lhs);
			long rhsBits = Double.doubleToLongBits(rhs);
			if (lhsBits == rhsBits) {
				return 0;
			}
			
			if (lhsBits < rhsBits) {
				return -1;
			} else {
				return +1;
			}
		}

		/**
		 * Compares two floats for order.
		 *
		 * @param lhs the first float value
		 * @param rhs the second float value
		 * @return -1 if lhs is less than rhs, +1 if lhs is greater than rhs,
		 *         0 if lhs is equal to rhs
		 */
		public int compare(float lhs, float rhs) {
			if (lhs < rhs) {
				return -1;
			}
			if (lhs > rhs) {
				return +1;
			}

			int lhsBits = Float.floatToIntBits(lhs);
			int rhsBits = Float.floatToIntBits(rhs);
			if (lhsBits == rhsBits) {
				return 0;
			}

			if (lhsBits < rhsBits) {
				return -1;
			} else {
				return +1;
			}
		}

		/**
		 * Checks whether the String is a valid Java number. Valid numbers include those marked with a type qualifier,
		 * hexadecimal numbers marked with the 0x qualifier, and numbers in scientific notation.
		 *
		 * Null and empty String will return false.
		 *
		 * @param str the String to check
		 * @return true if the String is a correctly formatted number, false otherwise
		 */
		public boolean isNumber(String str) {
			if (str == null || str.length() == 0) {
				return false;
			}
			char[] chars = str.toCharArray();
			int sz = chars.length;
			boolean hasExp = false;
			boolean hasDecPoint = false;
			boolean allowSigns = false;
			boolean foundDigit = false;
			// handle sign up
			int start = (chars[0] == '-') ? 1 : 0;
			if (sz > start + 1) {
				if (chars[start] == '0' && chars[start + 1] == 'x') {
					int i = start + 2;
					if (i == sz) {
						return false; // str == "0x"
					}
					// checking hex
					for (; i < chars.length; i++) {
						if ((chars[i] < '0' || chars[i] > '9') && (chars[i] < 'a' || chars[i] > 'f') && (chars[i] < 'A' || chars[i] > 'F')) {
							return false;
						}
					}
					return true;
				}
			}
			sz--; // avoid the last type qualifiers
			int i = start;
			while (i < sz || (i < sz + 1 && allowSigns && !foundDigit)) {
				if (chars[i] >= '0' && chars[i] <= '9') {
					foundDigit = true;
					allowSigns = false;
				} else if (chars[i] == '.') {
					if (hasDecPoint || hasExp) {
						return false;
					}
					hasDecPoint = true;
				} else if (chars[i] == 'e' || chars[i] == 'E') {
					if (hasExp) {
						// two E's
						return false;
					}
					if (!foundDigit) {
						return false;
					}
					hasExp = true;
					allowSigns = true;
				} else if (chars[i] == '+' || chars[i] == '-') {
					if (!allowSigns) {
						return false;
					}
					allowSigns = false;
					foundDigit = false; // we need a digit after the E
				} else return false;
				i++;
			}
			if (i < chars.length) {
				if (chars[i] >= '0' && chars[i] <= '9') {
					// no type qualifier, OK
					return true;
				}
				if (chars[i] == 'e' || chars[i] == 'E') {
					// can't have an E at the last byte
					return false;
				}
				if (!allowSigns && (chars[i] == 'd' || chars[i] == 'D' || chars[i] == 'f' || chars[i] == 'F')) {
					return foundDigit;
				}
				if (chars[i] == 'l' || chars[i] == 'L') {
					// not allowing L with an exponent
					return foundDigit && !hasExp;
				}
				// last character is illegal
				return false;
			}
			// allowSigns is true iff the last char of val is 'E'
			// found digit to identify strange (non-number) content ('.' and '1E-')
			return !allowSigns && foundDigit;
		}

	}
	
	public class SortTools {

		/**
		 * Performs an insertion sort algorithm on a portion of an integer array.
		 *
		 * @param array the integer array to be sorted
		 * @param off the starting index of the portion to be sorted (inclusive)
		 * @param len the length of the portion to be sorted
		 * @return the sorted array, or null if the input is invalid
		 */
		public int[] insertionSort(int[] array, int off, int len) {
			if (array == null || off < 0 || len < 0 || off + len >= array.length)
				return null;
			for (int i = off + 1; i < off + len; ++i) {
				for (int j = i - 1; j > off; --j) {
					if (array[j - 1] > array[j]) {
						int tmp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = tmp;
					} else {
						break;
					}
				}
			}
			return array;
		}

		/**
		 * Compares two elements in an integer array.
		 *
		 * @param array the integer array containing the elements to compare
		 * @param i the index of the first element
		 * @param j the index of the second element
		 * @return -1 if the element at index i is less than the element at index j,
		 *          0 if the elements at index i and j are equal,
		 *          1 if the element at index i is greater than the element at index j
		 */
		protected int compare(int[] array, int i, int j) {
			if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) 
				throw new IllegalArgumentException("Wrong index.");
			return (array[i] < array[j]) ? -1 : ((array[i] == array[j]) ? 0 : 1);
		}

		/**
		 * Swaps the values at two slots in an integer array.
		 */
		public int[] swap(int[] array, int i, int j) {
			if (i < 0 || j < 0 || i >= array.length || j >= array.length) 
				return null;
			array[i] += array[j];
			array[j] = array[i] - array[j];
			array[i] = array[i] - array[j];
			return array;
		}

		/** Check if the range is appropriate. */
		public boolean checkRange(int from, int to) {
			return to < from;
		}


		/**
		 * Reverses a portion of the given array.
		 *
		 * @param array the array to reverse
		 * @param from  the starting index of the portion to reverse (inclusive)
		 * @param to    the ending index of the portion to reverse (inclusive)
		 * @return the reversed array, or null if the indices are invalid
		 */
		public int[] reverse(int[] array, int from, int to) {
			if (!(0 <= from && from <= to && to < array.length)) 
				return null;
		    for (--to; from < to; ++from, --to)
		      swap(array, from, to);
		    return array;
		}

		/**
		 * Rotates a portion of the given array.
		 *
		 * @param array the array to rotate
		 * @param lo    the starting index of the portion to rotate (inclusive)
		 * @param mid   the middle index of the portion to rotate
		 * @param hi    the ending index of the portion to rotate (inclusive)
		 * @return the rotated array, or null if the indices are invalid
		 */
		public int[] rotate(int[] array, int lo, int mid, int hi) {
			if (!(0 <= lo && lo <= mid && mid <= hi && hi < array.length)) 
				return null;
			if (lo == mid || mid == hi)
		    	return array;
		    doRotate(array, lo, mid, hi);
		    return array;
		}

		/**
		 * Performs the rotation operation on a portion of the given array.
		 *
		 * @param array the array to perform the rotation on
		 * @param lo    the starting index of the portion to rotate (inclusive)
		 * @param mid   the middle index of the portion to rotate
		 * @param hi    the ending index of the portion to rotate (inclusive)
		 * @return the modified array after rotation, or null if the indices are invalid
		 */
		public int[] doRotate(int[] array, int lo, int mid, int hi) {
			if (!(0 <= lo && lo <= mid && mid <= hi && hi < array.length)) 
				return null;
		    if (mid - lo == hi - mid) {
		    	// saves n/2 swaps
		    	while (mid < hi) {
		    	  	swap(array, lo++, mid++);
		      	}
		    } else {
		    	reverse(array, lo, mid);
		    	reverse(array, mid, hi);
		    	reverse(array, lo, hi);
		    }
		    return array;
		}
		
		/**
		 * Finds the lower bound index of a given value in a sorted integer array.
		 *
		 * @param array the sorted integer array to search in
		 * @param from the starting index of the search range (inclusive)
		 * @param to the ending index of the search range (inclusive)
		 * @param val the value to find the lower bound index for
		 * @return the lower bound index of the value, or -10086 if the input is invalid
		 */
		public int lower(int[] array, int from, int to, int val) {
			if (array == null || from < 0 || to < 0 || from >= array.length || to >= array.length)
				return -10086;
			int len = to - from;
			while (len > 0) {
				final int half = len >>> 1;
				final int mid = from + half;
				if (compare(array, mid, val) < 0) {
					from = mid + 1;
					len = len - half - 1;
				} else {
					len = half;
				}
			}
			return from;
		}

		/**
		 * Finds the upper bound index of a given value in a sorted integer array.
		 *
		 * @param array the sorted integer array to search in
		 * @param from the starting index of the search range (inclusive)
		 * @param to the ending index of the search range (inclusive)
		 * @param val the value to find the lower bound index for
		 * @return the upper bound index of the value, or -10086 if the input is invalid
		 */
		public int upper(int[] array, int from, int to, int val) {
			if (array == null || from < 0 || to < 0 || from >= array.length || to >= array.length)
				return -10086;
			int len = to - from;
			while (len > 0) {
				final int half = len >>> 1;
				final int mid = from + half;
				if (compare(array, val, mid) < 0) {
					len = half;
				} else {
					from = mid + 1;
					len = len - half - 1;
				}
			}
			return from;
		}

		/**
		 * Calculates the index of the next node in a binary heap.
		 *
		 * @param from the starting index of the heap
		 * @param i the current node index
		 * @return the index of the next node in the binary heap
		 */
		private int nextNode(int from, int i) {
			return ((i - from) << 1) + 1 + from;
		}
		
		/**
		 * Performs the sift-down operation on a portion of an integer array representing a binary heap.
		 *
		 * @param array the integer array representing the binary heap
		 * @param i the index of the current node to sift down
		 * @param from the starting index of the portion of the array representing the binary heap
		 * @param to the ending index of the portion of the array representing the binary heap
		 * @return the array after performing the sift-down operation, or null if the input is invalid
		 */
		public int[] siftDown(int[] array, int i, int from, int to) {
			if (array == null || i < 0 || from < 0 || i >= array.length || from >= array.length || to < 0 || to >= array.length)
				return null;
			int leftChild = nextNode(from, i);
			while (leftChild < to) {
				final int rightChild = leftChild + 1;
				if (compare(array, i, leftChild) < 0) {
					if (rightChild < to && compare(array, leftChild, rightChild) < 0) {
						swap(array, i, rightChild);
						i = rightChild;
					} else {
						swap(array, i, leftChild);
						i = leftChild;
					}
				} else if (rightChild < to && compare(array, i, rightChild) < 0) {
					swap(array, i, rightChild);
					i = rightChild;
				} else {
					break;
				}
				leftChild = nextNode(from, i);
			}
			return array;
		}
	}
}