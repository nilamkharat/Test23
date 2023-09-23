package Interface;

public interface Version_9 
{
	default void m1()
	{
		m3();
	}

	default void m2()
	{
		m3();
		System.out.println("Good Afternoon");
		System.out.println("Good NIght");
	}
	private void m3()
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
}
