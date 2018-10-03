import java.util.Scanner;

public class StringCapsDeleteA {

	public static void main(String[] args) {

		// If you want to parse your string just comment hard code ''str and uncomment 'str' from scanner class.
		// System.out.println("Hello World" + "\n\n\nEnter a String: ");
		// Scanner s = new Scanner(System.in);
		// String str = s.nextLine();


		String str = "a very good person !!";
		String str1 = "baa baa, nice girl!";
		System.out.println("FIRST INPUT      :  " + str + "\nEXPECTED OUTPUT  :  " + "VERY GOOD PERSON\n"
				+ "\nSECOND INPUT     :  " + str1 + "\nEXPECTED OUTPUT  :  " + "B B, NICE GIRL!\n\n");

		char[] strArr = str.replace("a", "").toCharArray();
		char[] strArr1 = str1.replace("a", "").toCharArray();
		System.out.print("Output 1         :  ");
		for (int a = 0; a < strArr.length; a++) {
			strArr[a] = Character.toUpperCase(strArr[a]);
			System.out.print(strArr[a]);
		}
		System.out.print("\nOutput 2         :  ");
		for (int a = 0; a < strArr1.length; a++) {
			strArr1[a] = Character.toUpperCase(strArr1[a]);
			System.out.print(strArr1[a]);
		}
	}
}
