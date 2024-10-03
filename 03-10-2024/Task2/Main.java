import java.util.Scanner;
class Main{
	static String name;
	static int age;
	static int retire = 67;

	public static void main(String[] args) {
		System.out.println("Please type your name");

		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();

		System.out.println("Hello " + name);
		System.out.println("Please type your age");

		age = scan.nextInt();
		System.out.println("You are " + age + " years old");

		System.out.println("You are " + (retire - age) + " years from retirement");
	}
}