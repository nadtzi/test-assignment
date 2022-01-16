package menu;

import java.util.ArrayList;
import java.util.Scanner;

import user.*;





public class UserMenu {

	static ArrayList<User> users = new ArrayList<>();

	public UserMenu() {


		//load();


		Scanner cin = new Scanner(System.in);
		while (true) {

			System.out.println("Choose any of the Available options:");
			System.out.println("=========================================");
			System.out.println("1: Insert a User Data\n");
			System.out.println("2: Insert a Child User Data\n");
			System.out.println("3: Find a User with their ID\n");
			System.out.println("4: Remove User with their ID\n");
			System.out.println("5: Update User data with their ID\n");
			System.out.println("6: Display all Users\n");
			System.out.print("7: Display child users under a parent");
			System.out.println("=========================================\n");
			System.out.print("Enter your choice: ");
			int choice = cin.nextInt();
			switch (choice) {
			case 1: //add user
				System.out.print("Enter the first name: ");

				String fname = cin.nextLine();
				System.out.println();

				System.out.print("Enter the last name: ");
				String lname = cin.nextLine();
				System.out.println();

				System.out.print("Enter the street name: ");
				String street = cin.nextLine();
				System.out.println();

				System.out.print("Enter the city name: ");
				String city = cin.nextLine();
				System.out.println();

				System.out.print("Enter the state name: ");
				String state = cin.nextLine();
				System.out.println();

				System.out.print("Enter the zip: ");
				int zip = cin.nextInt();
				System.out.println();

				users.add(new ParentUser(fname, lname, street, city, state, zip));
				System.out.println("user added successfully");
				System.out.println();
				break;

			case 2: //add child user
				System.out.print("Enter the ID of the parent: ");
				long id = cin.nextLong();

				for(int i=0; i<users.size();i++) {
					if(users.get(i).getUID()==id)
					{
						System.out.print("Enter the first name: ");

						fname = cin.nextLine();
						System.out.println();

						System.out.print("Enter the last name: ");
						lname = cin.nextLine();
						System.out.println();

						users.add(new ChildUser(fname, lname, id));
						System.out.println("user added successfully");
						break;
					}
				}

				System.out.println();

				break;

			case 3: //find user

				System.out.print("Enter the ID of the user: ");
				id = cin.nextLong();

				for(int i=0; i<users.size();i++) {
					if(users.get(i).getUID()==id)
					{
						users.get(i).toString();
						break;
					}
				}

				System.out.println();

				break;

			case 4: // delete user
				System.out.print("Enter the ID of the user: ");
				id = cin.nextLong();

				for(int i=0; i<users.size();i++) {
					if(users.get(i).getUID()==id)
					{
						users.get(i).toString();
						users.remove(i);
						System.out.println("successfully removed");
						break;
					}
				}

				System.out.println();

				break;
			case 5: //update user data
				System.out.print("Enter the ID of the user: ");
				id = cin.nextLong();

				for(int i=0; i<users.size();i++) {
					if(users.get(i).getUID()==id)
					{
						users.get(i).toString();
						if(users.get(i) instanceof ParentUser) {
							System.out.println("Choose any of the Available data you would like to edit:");
							System.out.println("=========================================");
							System.out.println("1: First Name\n");
							System.out.println("2: Last Name\n");
							System.out.println("3: Street\n");
							System.out.println("4: City\n");
							System.out.println("5: State\n");
							System.out.println("6: ZIP\n");
							System.out.println("=========================================\n");
							System.out.print("Enter your choice: ");
							int choice1 = cin.nextInt();
							switch (choice1) {
							case 1: 

							case 2: 

							case 3: 

							case 4: 

							case 5: 

							case 6: 

							default:
							}
						}
						else {
							System.out.println("Choose any of the Available data you would like to edit:");
							System.out.println("=========================================");
							System.out.println("1: First Name\n");
							System.out.println("2: Last Name\n");
							System.out.println("3: Parent ID\n");
							System.out.println("=========================================\n");
							System.out.print("Enter your choice: ");
							int choice1 = cin.nextInt();
							switch (choice1) {
							case 1: 

							case 2: 

							case 3: 

							default:
							}
						}
						break;
					}
				}

				break;
			case 6:

				break;
			default:
				System.out.print("Invalid entry\n");
			} 
		} 

	}
}
