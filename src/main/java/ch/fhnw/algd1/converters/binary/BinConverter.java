package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		String s = "";
		while (s.length() != 8) {
			if ((x & 1) != 0)
				s = "1" + s;
			else
				s = "0" + s;
			x = x >>> 1;
		}
		return s;
	}

	public static int fromString(String text) {
		int i = 0;
		int x = 0;
		while ((i < text.length())) {
			x = (x << 1) | (text.charAt(i) == '0' ? 0 : 1);
			i++;
		}
		return (byte) x;
	}
}