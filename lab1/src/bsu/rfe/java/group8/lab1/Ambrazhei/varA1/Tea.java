package bsu.rfe.java.group8.lab1.Ambrazhei.varA1;

public class Tea extends Food {
	private String color;
	static int Count = 0;

	public Tea(String color) {
		super ("Чай");
		this.color = color;
	}
	public void consume() 
		{
		System.out.println(this + "выпит");
		}
	public String getColor() 
		{
		return color; 
		}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
//	public boolean equals(Object arg0)
//	{
//		if (super.equals(arg0))
//		{
//		if (!(arg0 instanceof Tea)) return false;
//			return color.equals(((Tea)arg0).color);
//		} 
//		else
//			return false; 
//	}
//	
//	public int GetCount()
//	{
//		return this.Count;
//	}

	public String toString()
	{
		return super.toString() + " цвета '" + color.toUpperCase() + "'";
	}
}
