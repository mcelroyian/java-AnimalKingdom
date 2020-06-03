package kingdom;

abstract class AbstractAnimal
{
	protected static int maxId;
	protected int food;
	protected int id;
	protected String name;
	protected int yearDiscovered;

	// All animals consume food the same way
	// Each animal is assigned a unique number, a name, 
	// and year discovered regardless of classification.

	public AbstractAnimal(String name, int yearDiscovered)
	{
		id = ++maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	void eatFood(int food)
	{
		this.food -= food;
	}

	String getName()
	{
		return name;
	}

	int getYear()
	{
		return yearDiscovered;
	}

	// Methods will return a string saying how that 
	// animal implements the action
	// All animals can move, breath, reproduce. 
	// How they do that, so what string should get 
	// returned when the method is executed, varies 
	// by animal type.

	abstract String howBreath();
	abstract String howMove();
	abstract String howCop();
}