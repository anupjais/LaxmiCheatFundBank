import java.util.*;
class StringLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		// sc.nextLine();
		System.out.print(name.checkLength()+"\n");
		
	}
	public static void checkLength(String name)
	{
		System.out.println(name+" contains "+ name.length());
	}
}
