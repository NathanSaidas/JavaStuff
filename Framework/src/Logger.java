
public class Logger 
{
	public static void Log(String msg)
	{
		System.out.println("[Log]:" + msg);
	}
	
	public static void Log(String msg, boolean conditional)
	{
		if(conditional)
		{
			System.out.println("[Log]:" + msg);
		}
	}
	
	public static void Warning(String msg)
	{
		System.out.println("[Warning]:" + msg);
	}
	
	public static void Warning(String msg, boolean conditional)
	{
		if(conditional)
		{
			System.out.println("[Warning]:" + msg);
		}
	}
	
	public static void Error(String msg)
	{
		System.out.println("[Error]:" + msg);
	}
	
	public static void Error(String msg, boolean conditional)
	{
		if(conditional)
		{
			System.out.println("[Error]:" + msg);
		}
	}
}
