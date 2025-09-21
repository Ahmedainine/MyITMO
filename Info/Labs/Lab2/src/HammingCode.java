

import java.util.Scanner;


public class HammingCode {
	public static boolean IsValidInput(String input)
	{
		if(input.length() != 7)
		{
			return false;
		}
		for(char C : input.toCharArray()) {
			if(C!='0' && C!='1')
			{
				return false;
			}
		}
		return true;		
	}
    public static String ReadInput()
    {
        Scanner in = new Scanner(System.in);
		String input;
		System.out.print("Enter 7 Digits Contaning just 1 and 0  :    \n");
		while(true)
		{
			System.out.print("Please Enter Input  :   "   );
			input = in.nextLine();
			if(IsValidInput(input))
			{
				break;
			}
			
		}
        return input;
    }
	public static int[] InputToBits(String input)
	{
		int Bits[] = new int[7];
		
		for(int i=0; i<Bits.length ; i++)
		{
			Bits[i] = input.charAt(i) - '0';
		}
		return Bits;
	}
	public static int [] Syndrome(int [] Bits)
	{
		int S1 = (Bits[0] + Bits[2] + Bits[4] + Bits[6])%2;
		int S2 = (Bits[1] + Bits[2] + Bits[5] + Bits[6])%2;
		int S3 = (Bits[3] + Bits[4] + Bits[5] + Bits[6])%2;
		return new int[] {S1,S2,S3};
	}

	public static boolean HasError(int [] Bits)
	{
		int[] Syn = Syndrome(Bits);
		return !(Syn[0]==0 && Syn[1]==0 && Syn[2]==0);
	}
	public static int GetErrorIndex(int [] Bits)
	{
		int [] Syn = Syndrome(Bits);
//		return (Syn[2]<<2) + (Syn[1]<<1) + Syn[0];
		return Syn[0]*1 + Syn[1]*2 + Syn[2]*4;
	}
	public static String GetErrorSymbol(int[] Bits)
	{
		int index = GetErrorIndex(Bits);
		switch(index)
		{
		case 1  :  return "r1";
		case 2  :  return "r2";
		case 3  :  return "i1";
		case 4  :  return "r3";
		case 5  :  return "i2";
		case 6  : return "i3";
		case 7  : return "i4";
		default : return "No Error";
		}
		
	}
	public static int[] GetInfoBits(int [] Bits)
	{
		return new int[]{Bits[2] , Bits[4] , Bits[5] , Bits[6]};
	}
	public static String GetCorrectMessage(int[] Bits)
	{
		StringBuilder result = new StringBuilder();
		for(int bit : Bits)
		{
			result.append(bit);
		}
		return result.toString();
	}
	public static String CorrectMessage(int[] Bits)
	{
		if(!HasError(Bits) || GetErrorSymbol(Bits).charAt(0) == 'r')
		{
			return GetCorrectMessage(GetInfoBits(Bits));
		}
		int index = GetErrorSymbol(Bits).charAt(1) - '1';
		int [] Result = GetInfoBits(Bits);
		Result[index] = (Result[index] == 0) ? 1 : 0;
		return GetCorrectMessage(Result);
	}
	
	public static void main(String[] args) {
		
	
		int [] Bits = InputToBits(ReadInput());
		if(HasError(Bits))
		{
			String ErrorSymbol = GetErrorSymbol(Bits);
			if(ErrorSymbol.charAt(0) == 'r')
			{
				System.out.println("Error detected at parity bit " + ErrorSymbol + 
                           "\nSo there is No Error in The Message :-)");
			}
			else
			{
				System.out.println("There is an Error in the Message :-(\nThe Error At Symbol " + ErrorSymbol);
			}
		}
		System.out.println("The Correct Message is  :   " + CorrectMessage(Bits));
		
		
		
		

	}

}
