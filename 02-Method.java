/* Methods --A method is a set of instructions return at one place to perform a specific task.
Syntax:-- return methodName(parameter){
-----
----Method definition
---
}

Types of Methods on the basis of parameter(input & return type )--Method have 4 types parameter-
01-Not take input-->>Not give output.--These are such methods which don't take any input
and doesn't return any output. */
package type;
public class typeone {

	public static void main(String[] args) {
		
		learnJava();
	}
	public static void learnJava() {
		System.out.println("I'm learning java");
	}

}



/*Type-02 Parameter -- These are such methods which accept input but doesn't
  give output.
  */

package type;
import java.util.Scanner;
public class typetwo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=scan.nextLine();
		learnJava(name);
	}
	
	public static void learnJava(String name) {
		System.out.println(name+" is learning java");
	}
}

/*
Type-03 Parameter -- These are such methods which will not accept any input
   but it returns output.
 * */

package type;

public class typethree {

	public static void main(String[] args) {
		int res=multiply();
		System.out.println("Multiple of two number is : "+ res);
	}
	public static int multiply() {
		int a=10;
		int b=5;
		int c=a*b;
		return c;
	}

}

/*
Type-04 Parameter -- These are such methods which accept input and 
  give output.
*/

package type;

import java.util.Scanner;

public class typefour {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter numerator : ");
	double a=scan.nextDouble();
	System.out.println("Enter denominator : ");
	double b=scan.nextDouble();
	double res=div(a,b);
	System.out.println(res);

	}
	public static double div(double a,double b) {
		double c=a/b;
		return c;
	}

}


