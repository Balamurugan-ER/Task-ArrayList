package framework;
import java.util.ArrayList;
public class Dog
{
	public Dog(String name)
	{
		this.name = name;
	}
	private String name;
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return this.name;
	}
}