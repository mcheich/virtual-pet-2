package main;

import java.util.Scanner;

public class VirtualPet2App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Welcome and create pet
		System.out.println("** Welcome to Virtual Pet Edition 2!! **\n");
		System.out.println("What would you like to name your pet?\n");
		String name = input.nextLine();
		System.out.println("How would you describe your pet?");
		String description = input.nextLine();
		VirtualPet2 virtualPet = new VirtualPet2(name, description);

		System.out.print("This is your pet: ");
		System.out.println(virtualPet.getName() + ", " + virtualPet.getDescription());
		System.out.println();

		int userOption = 0;
		showOption(name);

		while (userOption != 5) {

			// Get user selection
			System.out.println("What would you like to do with your pet?\n");
			userOption = input.nextInt();
			
			// User selection logic
			switch (userOption) {
			case 0:
				showStatus(virtualPet);
				break;
			case 1:
				virtualPet.feed();
				System.out.println("You fed " + name);
				break;
			case 2:
				virtualPet.drink();
				System.out.println("You watered " + name);
				break;
			case 3:
				virtualPet.play();
				System.out.println("You played with " + name);
				break;
			case 4:
				showOption(name);
				break;
			default:
				System.out.println("Incorrect option.\n");
				showOption(name);
			}
			
			virtualPet.tick();

		}
		input.close();

		// Exit Game
		System.out.println("** Thank you for playing! **");
		System.exit(0);
	}

	/**
	 * This method display the VirtualPet attributes.
	 * 
	 * @param pet
	 */
	private static void showStatus(VirtualPet2 pet) {
		System.out.println(pet.getName() + " feels like this:");
		System.out.println("Hunger: " + pet.getHunger());
		System.out.println("Thirst: " + pet.getThirst());
		System.out.println("Boredom: " + pet.getBoredom());
		System.out.println();
	}

	/**
	 * This method displays the user options to the console
	 */
	private static void showOption(String petName) {
		System.out.println("What do you want to do?");
		System.out.println("0. See status of " + petName);
		System.out.println("1. Feed " + petName);
		System.out.println("2. Water " + petName);
		System.out.println("3. Play with " + petName);
		System.out.println("4. Display options");
		System.out.println("5. Quit");
	}

}
