import java.util.*;
class LaxmiCheatFund
{
	static String name;
	static String email;
	static String addr;
	static long phone;
	static long adrNo;
	static long upiPin;
	// static long phone;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		homeMenu();
	}

	// Mothods Starts Here...

	public static void starPatten(String nm)
	{
		System.out.print("\n\t\t\t");
		for (int i=0; i<nm.length()-7; i++)
		{
			System.out.print(" ");
		}
	}
	public static void halfStarPatten()
	{
		// System.out.print();
		for (int i=0; i<5; i++)
		{
			System.out.print(" ");
		}
	}
	public static void clrScr()
	{
		System.out.println("\033[H\033[2J");
	}
	public static void homeMenu()
	{
		String greet = "Welcomet To Laxmi-Cheat-Fund Bank ";
		clrScr();
		starPatten(greet);
		System.out.println();
		halfStarPatten();
		System.out.print(greet);
		halfStarPatten();
		System.out.println();
		starPatten(greet);
	}
}