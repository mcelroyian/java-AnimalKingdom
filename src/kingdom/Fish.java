package kingdom;

public class Fish extends AbstractAnimal
{
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override public String howBreath()
	{
		return "Gills";
	}
	@Override public String howMove()
	{
		return "Swim";
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