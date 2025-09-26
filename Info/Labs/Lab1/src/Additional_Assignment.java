import java.util.Scanner;

public class Additional_Assignment{

     private static final Scanner in = new Scanner(System.in);

    public static int ReadAndValidateInput()
    {
        int number=0;
        while (true) { 
            System.out.print("Enter a non-negative number  :   ");
            String input = in.nextLine();
            try {
                number = Integer.parseInt(input);
                if(number < 0)
                {
                    System.err.println("Invalid Input :-(\nNumber Must be non-negative , Try AGain !");
                }
                else{
                    break;
                }

            } catch (NumberFormatException e) {
                System.err.println("Invalid input :-(\n'" + input + "' Is not a Number , Try AGain !");
            }
        }
        return number;
    }
    public static int[] Fibonacci(int max)
    {

        int previous = 1 , current = 2;
        int counter=2; 
        while(previous + current <= max)
        {
            int temp = previous + current;
            previous = current;
            current = temp;
            counter++;
        }
        int [] Fibs = new int[counter];
        Fibs[0] = 1;
        Fibs[1] = 2;
        previous = 1 ; 
        current = 2;
        for(int i=2 ; i<counter ; i++)
        {
            Fibs[i] = previous + current;
            previous = current;
            current = Fibs[i];
        }
        return Fibs;
    }
    public static String DecimalToFib(int number)
    {
        StringBuilder result = new StringBuilder();
        int[] Fibs = Fibonacci(number);
        int i = Fibs.length - 1;
        while(i>=0)
        {
            if(Fibs[i] <= number)
            {
                result.append("1");
                number -= Fibs[i];
            }
            else{
                result.append("0");
            }
            i--;
        }
        while(result.length() > 1 && result.charAt(0)=='0')
        {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
    public static void ShowResult()
    {
        int number = ReadAndValidateInput();
        String FibRep = DecimalToFib(number);
        System.out.println("Fibonacci Representation of " + number + " is  :  " + FibRep);
    }
    public static void main(String[] args)
    {
        ShowResult();
    }
}