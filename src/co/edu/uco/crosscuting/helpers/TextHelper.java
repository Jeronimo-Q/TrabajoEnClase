package co.edu.uco.crosscuting.helpers;

public class TextHelper {
	
	public static final String EMPTY = "";
	
	private TextHelper() {
		
	}
	
	public static boolean isNull(final String string) {
		return ObjectHelper.isNull(string);
	}
	
	public static String getDefault(final String string, final String defaultValue) {
		return ObjectHelper.getDefault(string, defaultValue);
	}

	public static String getDefault(final String string) {
		return getDefault(string, EMPTY);
	}
	
	public static boolean isEmpty(final String string) {
		return EMPTY.equals(getDefault(string));
	}
	
	public static boolean isEmptyAppplyingTrim(final String string) {
		return isEmpty(applyTrim(string));
	}
	
	public static String applyTrim(final String string) {
		return getDefault(string).trim();
	}
	
	public static void main(String[] args) {
		String b = null;
		
		
		System.out.println(b.trim());
	}

}
