import java.util.Scanner;

public class Factorial
	{

		static Scanner input = new Scanner(System.in);
		static int answer;
		static int finalFact = 1;
		
		public static void main(String[] args)
			{
				System.out.println("Give me a number and I will do the factorial for it");
				answer = input.nextInt();
				fact(answer);
			}
		
		public static void fact(int n)
		{
			for(int i = answer; i > 0; i--)
				{
					finalFact = finalFact * i;
				}
			System.out.println(answer + "! is " + finalFact);
		}

	}
