package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] chars = test.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (i % 2 != 0) {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}

		String result = new String(chars);
		System.out.println("Converted string: " + result);
	}

}
