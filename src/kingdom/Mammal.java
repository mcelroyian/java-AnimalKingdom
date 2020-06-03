package kingdom;

public class Mammal extends AbstractAnimal
{
	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override public String howBreath()
	{
		return "Lungs";
	}

	@Override public String howMove()
	{
		return "Walk";
	}

	@Override public String howCop()
	{
		return "Live Births";
	}

	@Override public String toString()
	{
		return name + " " + howCop() + " " + howMove() + " " + howBreath() + " " + yearDiscovered + "\n";
	}
}