/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Offering offering=new Coffee();
	    offering=new Rum(offering);
	    offering=new Rum(offering);
	    offering=new Gin(offering);
		System.out.println(offering.getName() + " " + offering.getPrice());
	}
}
