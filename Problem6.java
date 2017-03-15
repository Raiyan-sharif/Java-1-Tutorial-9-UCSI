import java.io.*;
public class Problem6 {

	public static void main(String args[]) {
		String Str1 = new String("Welcome to Java");
		System.out.println(Str1);
		System.out.println("Replaced to" );
		System.out.println(Str1.replace("Java", "USCI"));
		System.out.println();

		String Str2 = new String("My Name is Sam");
		System.out.println(Str2);
		System.out.println("Replaced to" );
		System.out.println(Str2.replace("Sam", "Jack ma"));
		System.out.println();

		String Str3 = new String("Every morning I go to market");
		System.out.println(Str3);
		System.out.println("Replaced to" );
		System.out.println(Str3.replace("to market", "Jogging"));
		System.out.println();


	}
}