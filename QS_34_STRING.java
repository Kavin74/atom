public class DoubleString {
	public static void main(String[] args) {
		String str = " ";
		int len = str.length();
		String s1 = str.substring(0, len / 2);
		String s2 = str.substring(len / 2, len);
		if (s1.equals(s2)) {
			System.out.println("the String is ");
		}
		else{
			System.out.println("Given String is not ");
		}
	}
}