package kingdom;

import java.util.*;
public class Main{

	public static void main(String[] args)
	{
		System.out.println("Running");

		List<AbstractAnimal> animals = createAnimalList();
		
		// List all the animals in descending order by year named
		Collections.sort(animals, (a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));

		System.out.println("\n***Animals by Year, descending");
		animals.forEach(a -> System.out.print(a.toString()));


		// List all the animals alphabetically
		animals.sort( (a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()) );

		System.out.println("\n***Animals alphabetically");
		animals.forEach(a -> System.out.print(a.toString()));

		// List all the animals order by how they move
		animals.sort( (a1, a2) -> a1.howMove().compareToIgnoreCase(a2.howMove()) );

		System.out.println("\n***Animals by movement");
		animals.forEach(a -> System.out.print(a.toString()));

		// List only those animals the breath with lungs
		// List only those animals that breath with lungs and were named in 1758
		// List only those animals that lay eggs and breath with lungs
		// List alphabetically only those animals that were named in 1758

		// STRETCH GOAL
		// For the list of animals, list alphabetically those animals that are mammals.






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

