import java.util.Scanner;
public class Week3 
{
	public static void main(String[] args) 
	{
		//ECounter
		//Declare a Scanner object
		Scanner scanner = new Scanner(System.in);
		//Print a statement asking a user for a sentence, and store input as a String
		System.out.print("Please enter a phrase: ");
		String message = scanner.nextLine();
		int counter = 0;
		//Use a for loop to iterate through the string, and count the number of times
		//the letter 'e' is present, either in uppercase or lowercase.
		for (int i = 0; i < message.length(); i++)
		{
			char ch = message.charAt(i);
			if (ch== 'e' || ch=='E')
			{
				counter++;
			}
		}
		//Print the number of times 'e' was counted
		System.out.println("The phrase '" + message + "' contains " + counter + " e's."); 	
		//Close the scanner
		//scanner.close();
		
		
		//Factorial
		//Declare an int variable to represent the total factorial value
		int factorial = 1;
		//Use a for loop to multiply every number between 1 and 10 together
		for (int i = 1; i <= 10; i++)
		{
			factorial *= i;
		}
		//Use another for loop to print the equation. (hint: to make sure there is no new line)
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i);
			if (i < 10) {
				System.out.print(" x ");
			}
		}
		System.out.println(" = " + factorial);
		
		//ASCIINumbers
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println("ASCII value of " + ch +  ": " + (int) ch);
		}
		
		//Fibonacci
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i < 10; i++)
		{
			int next = a + b;
			System.out.println(next);
			a = b;
			b = next;
		}
		
		//Multiplication
		for (int i = 1; i <= 5; i++)
		{
            for (int j = 1; j <= 5; j++) 
            {
                System.out.print(i * j);
                if (j < 5)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
		
		//PrintEvenNumbers
		for (int i = 20; i <= 40; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
		//PrintUpLow
		for (char lower = 'a'; lower <= 'z'; lower++)
		{
			char upper = Character.toUpperCase(lower);
			System.out.println(lower + "" + upper);
		}
		
		//PrintCharacters
		for (char ch = 'a'; ch <= 'z'; ch++)
		{
			System.out.print(ch);
		}
		
		//PrintNumbers
		for (int num = 0 ; num <= 10; num++)
		{
			System.out.println(num);
		}
		
		//NumberSquares
		for (int num = 1 ; num <= 10; num++)
		{
			int square = num * num;
			System.out.println(square);
		}
		
		//PrintOddNumbers
		for (int i = 21; i <= 39; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
		
		//StringPrinter
		Scanner string = new Scanner(System.in);
		System.out.print("Intput string: ");
		String msg = string.nextLine();
		for (int i = 0; i < msg.length();i++)
		{
			System.out.println(msg.charAt(i));
		}
		
		//WhileGo
		boolean go = true;
		
		Scanner WG = new Scanner(System.in);
		
		while (go)
		{
			System.out.print("Go? ");
			
			go = WG.nextBoolean();
		}
		
		//PrintToTen
		for (int num = 1 ; num <= 10; num++)
		{
			System.out.println("number = "+num);
		}
		
		//Tally
		int tally = 0;
		Scanner ty = new Scanner(System.in);
		int inputNumber;
		do
		{
			System.out.print("Enter a number, 0 to quit: ");
			inputNumber = ty.nextInt();
			tally += inputNumber;
			System.out.printf("Tally: %d%n", tally);
		}
		while (inputNumber != 0);
		
		
		//Maxinteger
		int max = Integer.MIN_VALUE;
		Scanner maxint = new Scanner(System.in);
		int inputNum;
		do
		{
			System.out.print("Please Enter a Number: ");
			inputNum = maxint.nextInt();
			if(inputNum > max)
			{
				max = inputNum;
				System.out.printf("max = %d%n", max);
			}
		}
		while (inputNum >= 0);
	}

}
