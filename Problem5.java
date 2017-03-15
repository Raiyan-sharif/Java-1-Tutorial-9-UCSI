import java.io.*;
import java.util.*;
public class Problem5 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first city");
		String Str1 = sc.next();
		System.out.println("Enter the second city" );
		String Str2=sc.next();
		System.out.print("The cities in alphabetical order are " );
		int result = Str1.compareTo( Str2 );
		if(result>=0){
			System.out.println(Str2+ " " + Str1);
		}
		else{
			System.out.println(Str1+ " " + Str2);
		}
	}
}