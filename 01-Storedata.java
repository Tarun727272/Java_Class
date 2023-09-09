// 01- Write a java program to store and retrieve the value of every data type.

import java.util.Scanner;
public class Storethedatatype {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a byte value : ");
		byte a=scan.nextByte();
		System.out.println("Entered byte value is "+a);
		
		System.out.println("Enter a short value : ");
		short b=scan.nextShort();
		System.out.println("Entered short value is "+b);
		
		System.out.println("Enter a integer value : ");
		int c=scan.nextInt();
		System.out.println("Entered integer value is "+c);
		
		System.out.println("Enter a long value");
		long d=scan.nextLong();
		System.out.println("Entered long value is "+d);
		
		System.out.println("Enter a float value : ");
		float e=scan.nextFloat();
		System.out.println("Entered float value is "+e);
		
		System.out.println("Enter a double  value : ");
		double f=scan.nextDouble();
		System.out.println("Entered double value is "+f);
		
		System.out.println("Enter a char value");
		char g=scan.next().charAt(0);
		System.out.println("Entered char value is "+g);
		
		
		System.out.println("Enter a boolean value :");
		boolean h=scan.nextBoolean();
		System.out.println("Entered boolean value is "+h);
		
		
		System.out.println("Enter a string  value");
		scan.nextLine();
		String i=scan.nextLine();
		System.out.println("Entered string value is "+i);
	}

}
