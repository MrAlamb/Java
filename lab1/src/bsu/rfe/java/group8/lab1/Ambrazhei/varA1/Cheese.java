package bsu.rfe.java.group8.lab1.Ambrazhei.varA1;

public class Cheese extends Food {
	static int Count = 0;
	public Cheese() 
		{
		super("Сыр");
		}
	
	public void consume()
	{
		System.out.println(this + " съеден");
	}

}
