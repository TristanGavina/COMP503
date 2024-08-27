import java.util.Scanner;
public class Week2 
{
	public static void main(String[] args)
	{
		//Question 1 HelloWorld
		//output Hello World! here
		System.out.println("Hello World!");

		//Question 2 GreetingApplication
		//declare Scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		//declare String object and assign scanner.nextLine()
		String message  = scanner.nextLine();
		//print message String to console
		System.out.println("Hello " +message);
		
		//Question 3 RectangleAreaCalculator
		//declare integer-typed variable length with value 5
		int length = 5;
		//declare integer-typed variable width with value 3
		int width = 3;
		// declare integer-typed variable area
		// assigned a value computed from the product of length and width
		int area = length * width;
		//print formatted output value of area
		System.out.println("area = " +area);
		
		//Question 4 Arithmetic 
		int x = 5;
		int y = 3;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		int sum = x + y;
		int product = x * y;
		int mod = x % y;
		System.out.println("sum = " +sum);
		System.out.println("product = " +product);
		System.out.println("mod = " +mod);
		
		//Question 5 BooleanDataType 
		//Declare isRaining and isOutside Boolean variables here
		boolean isRaining = true;
		boolean isOutside = false;
		//Print the values isRaining and isOutside
		System.out.println("isRaining = "+isRaining);
		System.out.println("isOutside = "+isOutside);
		//Declare andResult, orResult, notResult variables here
		boolean andResult = isRaining && isOutside;
		boolean orResult = isRaining || isOutside;
		boolean notResult = !isOutside;
		//Print andResult, orResult, notResult variables here
		System.out.println("andResult = "+andResult);
		System.out.println("orResult = "+orResult);
		System.out.println("notResult = "+notResult);

		//Question 6 CharOut
		char five = '5';
		char letter = 'A';
		//declare fiveValue and letterValue here
		int fiveValue = five;
		int letterValue = letter;
		//formatted output of fiveValue and letterValue here
		System.out.println("fiveValue = "+fiveValue);
		System.out.println("letterValue = "+letterValue);
		
		//Question 7 CircleAreaCalculator
		double radius = 10.5;
		double area1 = Math.PI * radius * radius;
		//use string concatenation to print the area valued as formatted output
		System.out.println("area = " +area1);
		
		//Question 8 Convert
		char four = '5' - 1;
		char letter1 = 'C' - 2;
		//print formatted output values of four and letter
		System.out.println("four = "+four);
		System.out.println("letter = "+letter1);
		//declare fourValue and letterValue
		int fourValue = four;
		int letter1Value = letter1;
		//print formatted output values of fourValue and letterValue
		System.out.println("four = "+fourValue);
		System.out.println("letter = "+letter1Value);
		
		//Question 9 Relations
		int a = 2;
		int b = 8;
		System.out.println("x = "+a);
		System.out.println("z = "+b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		
		//Question 10 HelloWorld
		String s = "Hello World!";
		System.out.println("s = "+s);
		int len = s.length();
		System.out.println("len = "+len);
		char ch = s.charAt(6);
		System.out.println("ch = "+ch);
		
		//Question 11 TempConvert
		//declare celsius = 31.5;
		double celsius = 31.5;
		//print celsuis = ...
		System.out.println("celsius = "+celsius);
		//declare fahrenheit = celsius * 9/5 + 32;
		double fahrenheit = celsius * 9/5 + 32;
		//print fahrenheit
		System.out.println("fahrenheit = "+fahrenheit);
		
		//Question 12 AgeApplication
		//declare Scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?");
		//declare the age variable and assign scanner.nextInt()
		int age = scan.nextInt();
		//print age message String to console
		System.out.println("age = "+age);
		
		//Question 13 AgeChecker
		//declare Scanner object
		Scanner scans = new Scanner(System.in);
		System.out.println("What is your age?");
		//declare int object and assign scanner.nextInt()
		int age1 = scans.nextInt();
		//use if/else statement to print appropriate message according to age.
		if (age1>40)
		{
			System.out.println("You are too old");
		}
		else
		{
			System.out.println("You are too young");
		}
		
		//Question 14 WhichGen
		Scanner scanner1 = new Scanner(System.in);
		// Print the "What is your birth year?" message to the console
		System.out.println("What is your birth year?");
		int birthYear = scanner1.nextInt();
		if (birthYear >= 1928 && birthYear <= 1945) {
            System.out.println("Silent Generation");
        } else if (birthYear >= 1946 && birthYear <= 1964) {
            System.out.println("Baby Boomers");
        } else if (birthYear >= 1965 && birthYear <= 1980) {
            System.out.println("Generation X");
        } else if (birthYear >= 1981 && birthYear <= 1996) {
            System.out.println("Millennials (Generation Y)");
        } else if (birthYear >= 1997 && birthYear <= 2015) {
            System.out.println("Generation Z");
        }
		// Close the Scanner to prevent resource leaks
		scanner1.close();
	}
}
