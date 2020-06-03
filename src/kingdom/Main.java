package kingdom;

import java.util.*;
public class Main{


	private static List<AbstractAnimal> filterAnimals(List<AbstractAnimal> animals, Filter test )
	{
		List<AbstractAnimal> filteredAnimals = new ArrayList<>();

		for (AbstractAnimal a : animals)
		{
			if (test.check(a))
			{
				filteredAnimals.add(a);
			}
		}
		return filteredAnimals;
	}

	public static void main(String[] args)
	{
		System.out.println("Running");

		List<AbstractAnimal> animals = createAnimalList();
		
		// List all the animals in descending order by year named
		Collections.sort(animals, (a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));

		System.out.println("\n***Animals By Year, descending\n" + animals.toString());


		// List all the animals alphabetically
		animals.sort( (a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()) );

		System.out.println("\n***Animals alphabetically\n" + animals.toString());

		// List all the animals order by how they move
		animals.sort( (a1, a2) -> a1.howMove().compareToIgnoreCase(a2.howMove()) );

		System.out.println("\n***Animalls by movement\n" + animals.toString());

		// List only those animals the breath with lungs
		List<AbstractAnimal> breathsWithLungs = filterAnimals(animals, a -> a.howBreath() == "Lungs" );

		System.out.println("\n***Animals That breath with lungs");
		breathsWithLungs.forEach(a -> System.out.print(a.toString()));

		// List only those animals that breath with lungs and were named in 1758
		List<AbstractAnimal> breathsWithLungs1758 = filterAnimals(animals, a -> (a.howBreath() == "Lungs") && (a.getYear() == 1758) );

		System.out.println("\n***Animals That breath with lungs, discovered in 1758");
		breathsWithLungs1758.forEach(a -> System.out.print(a.toString()));


		// List only those animals that lay eggs and breath with lungs
		List<AbstractAnimal> laysEggsWithLungs = filterAnimals(animals, a -> (a.howBreath() == "Lungs") && (a.howCop() == "Eggs") );

		System.out.println("\n***Animals That breath with lungs, and lays eggs");
		laysEggsWithLungs.forEach(a -> System.out.print(a.toString()));


		// List alphabetically only those animals that were named in 1758
		List<AbstractAnimal> animals1758 = filterAnimals(animals, a -> (a.getYear() == 1758) );
		animals1758.sort(Comparator.comparing(a -> a.getName()));
		//myList.sort(Comparator.comparing(o -> o.getKey().toString()));
		System.out.println("\n***Animals named in 1758, alphabetically");

		animals1758.forEach(a -> System.out.print(a.toString()));



		// STRETCH GOAL
		// For the list of animals, list alphabetically those animals that are mammals.
		List<AbstractAnimal> mammals = filterAnimals(animals, a -> a instanceof Mammal);
		mammals.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()) );

		System.out.println("\n***Mammals, alphabetically");

		mammals.forEach(m -> System.out.print(m.toString()));


		// ########### LEFT OVER STUFF #####################

		// System.out.println("\n***Printing whole list\n" + animals.toString());
		// System.out.println("\n***Printing from for each loop");
		// animals.forEach(a -> System.out.print(a.toString()));
		
	}

	private static List<AbstractAnimal> createAnimalList()
	{
		// Create mammals
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		List<AbstractAnimal> animals = new ArrayList<>();

		animals.add(panda);
		animals.add(zebra);
		animals.add(koala);
		animals.add(sloth);
		animals.add(armadillo);
		animals.add(raccoon);
		animals.add(bigfoot);

		//Create Birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		animals.add(pigeon);
		animals.add(peacock);
		animals.add(toucan);
		animals.add(parrot);
		animals.add(swan);

		//Create Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		animals.add(salmon);
		animals.add(catfish);
		animals.add(perch);

		return animals;
	}

}

