
import java.util.*;

public class Main 
{
	public static void DoTest()
	{
		// 128 64 32 16 8 4 2 1
		//
		// BIT 1 - 255, 127, 63, 31, 15, 7, 3, 1
		// BIT 2 - 254, 126, 62, 30, 14, 6, 2, 
		// BIT 3 - 
		
		// BIT 1 - 
		
		// G1 - 1, 3, 5, 7, 9, 11, 13, 15
		// G2 - 2, 3, 6, 7, 10, 11, 14, 15
		// G3 - 4, 5, 6, 7, 12, 13, 14, 15
		// G4 - 8, 9, 10, 11, 12, 13, 14, 15
		
		final int MAX_VALUE = 32;
		final int MAX_BITS = 5;
		
		List list = new ArrayList();
		
		
		
		List[] numberPools = new List[MAX_BITS];
		for(int i = 0; i < MAX_BITS; ++i)
		{
			numberPools[i] = new ArrayList();
			StringBuilder sb = new StringBuilder();
			sb.append("Pool[").append(Integer.toString(1 << i)).append("]:");
			int bit = (1 << i);
			
			for(int j = 0; j < MAX_VALUE; ++j)
			{
				int masked = bit & j;
				if(masked == bit)
				{
					numberPools[i].add(j);
					sb.append(Integer.toString(j) + ", ");
				}
			}
			
			Logger.Log(sb.toString());
		}
		
		int finalMask = 0;
		/*int number = 55;
		for(int i = 0; i < MAX_BITS; ++i)
		{
			boolean numberInPool = numberPools[i].contains(number);
			if(numberInPool)
			{
				finalMask |= (1 << i);
			}
		}*/
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < MAX_BITS; ++i)
		{
			Logger.Log("Is your number in Pool[" + Integer.toString(1 << i) + "]? (y/n)");
			
			String input = "";
			while(true)
			{
				input = scanner.next();
				if(input.equalsIgnoreCase("y"))
				{
					finalMask |= (1 << i);
					break;
				}
				else if(input.equalsIgnoreCase("n"))
				{
					break;
				}
				else
				{
					Logger.Log("Wrong input motherfucker!");
				}
			}
			
		}
		
		
		
		Logger.Log("Your number is " + Integer.toString(finalMask));

		// G1 G2 G3 
	}
	
	public static void main(String[] args)
	{
		DoTest();
	}
}
