package kingdom;

public class Bird extends AbstractAnimal
{
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override public String howBreath()
	{
		return "Lungs";
	}
	@Override public String howMove()
	{
		return "Fly";
	}
	@Override public String howCop()
	{
		return "Eggs";
	}

	@Override public String toString()
	{
		return "Animal[ID=" + id + ", Name=" + name + ", yearDiscovered=" + yearDiscovered + "]\n";
	}
}