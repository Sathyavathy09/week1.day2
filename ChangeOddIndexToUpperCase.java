package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String str = "welcome";
		char strArray[] = str.toCharArray();
		int len = strArray.length;

		for (int i = 0; i < len; i++) {
			if (i % 2 != 0) {
				char c = Character.toUpperCase(strArray[i]);
				System.out.print(c);
			} else
				System.out.print(strArray[i]);

		}

	}

}
