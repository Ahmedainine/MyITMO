
import java.util.Scanner;

public class Additional_Assignment {

    public static int ReadAndValidateInput()
    {
        int number ;
        while(true)
		{
            Scanner reader = new Scanner(System.in);
			System.out.print("Please enter a non-negative decimal number: ");
            String input = reader.nextLine();
			try {
                number = Integer.parseInt(input); 
                if (number < 0) {
                    System.err.println("Number must be non-negative. Try again!");
                }
                else {
                    break; 
                }
            } 
            catch (NumberFormatException e) {
                System.err.println("Invalid input:-( '" + input + "' is not a number. Try again!");
            }
		}
        return  number;
    }
	public static int[] Fibonacci(int max)
	{
		int [] temp = new int[100];
		temp[0] = 1;
		temp[1] = 2;
		int counter = 2;
		while(temp[counter-1]<= max)
		{
			temp[counter] = temp[counter-2] + temp[counter-1];
			counter++;
		}
		int [] Fibs = new int[counter];
		for(int i=0 ; i<counter ; i++)
		{
			Fibs[i] = temp[i];
		}
		return Fibs;
	}
	public static String DecimalToFib(int Number)

	{
		int[] Fibs = Fibonacci(Number);
		StringBuilder result = new StringBuilder();
		int i = Fibs.length - 1;
		while(i >=0)
		{
			if(Fibs[i] <= Number)
			{
				result.append("1");
				Number -= Fibs[i];
				i--;
				if(i>=0)
				{
					result.append("0");
				}
			}
			else
			{
				result.append("0");
			}
			i--;
		}
		while(result.length() > 1 && result.charAt(0) == '0')
		{
			result.deleteCharAt(0);
		}
		return result.toString();
	}
	public static void main(String[] args) {       
		int number = ReadAndValidateInput();
        String fibRep = DecimalToFib(number);
        System.out.println("Fibonacci representation: " + fibRep);  
       
	}

}
