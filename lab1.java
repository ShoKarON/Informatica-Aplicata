import java.util.*;
public class lab1 {
	public static int citire_int(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Int: ");
		int b=myInput.nextInt();
		return b;
	}
	public static String citire_String(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Introduce textul: ");
		String b=myInput.nextLine();
		return b;
	}
	public static float citire_float(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Float: ");
		float b=myInput.nextFloat();
		return b;
	}
	public static short citire_short(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Short: ");
		short b=myInput.nextShort();
		return b;
	}
	public static byte citire_byte(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Byte: ");
		byte b=myInput.nextByte();
		return b;
	}
	public static boolean citire_bool(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Bool: ");
		boolean b=myInput.nextBoolean();
		return b;
	}
	public static double citire_double(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Double: ");
		double b=myInput.nextDouble();
		return b;
	}
	public static long citire_long(){
		Scanner myInput = new Scanner( System.in );
		System.out.print("Citire Long: ");
		long b=myInput.nextLong();
		return b;
	}
	public static void main(String[]args) {
		//System.out.println(citire_int());
		//System.out.print(citire_String());
		//System.out.print(citire_float());
		//System.out.print(citire_short());
		//System.out.print(citire_byte());
		//System.out.print(citire_bool());
		//System.out.print(citire_double());
		System.out.print(citire_long());
		
	}
}
