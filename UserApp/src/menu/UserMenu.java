package menu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import user.*;





public class UserMenu {

	static ArrayList<User> users = new ArrayList<>();

	public UserMenu() {





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
			System.out.println("=========================================\n");
			System.out.print("Enter your choice: ");
			int choice = cin.nextInt();
			switch (choice) {
			case 1: //add user
				System.out.print("Enter the first name: ");
				cin.nextLine();	
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
				System.out.println("user added successfully, ID is " + users.get(users.size()-1).getUID());
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
						System.out.println(users.get(i).toString());
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
							case 1: System.out.println("1: Please Enter new First Name\n");
							cin.nextLine();	
							String name = cin.nextLine();
							users.get(i).setFirstName(name);
							System.out.println("The updated first name is "+ users.get(i).getFirstName());

							case 2: System.out.println("1: Please Enter new Last Name\n");
							name = cin.nextLine();
							users.get(i).setLastName(name);
							System.out.println("The updated last name is "+ users.get(i).getLastName());

							case 3: System.out.println("1: Please Enter new Street\n");
							String tstreet = cin.nextLine();
							((ParentUser)(users.get(i))).setStreet(tstreet);
							System.out.println("The updated street name is "+ ((ParentUser)(users.get(i))).getStreet());

							case 4: System.out.println("1: Please Enter new City\n");
							String tempCity = cin.nextLine();
							((ParentUser)(users.get(i))).setCity(tempCity);
							System.out.println("The updated city name is "+ ((ParentUser)(users.get(i))).getCity());

							case 5: System.out.println("1: Please Enter new state\n");
							String tempState = cin.nextLine();
							((ParentUser)(users.get(i))).setState(tempState);
							System.out.println("The updated state name is "+ ((ParentUser)(users.get(i))).getState());

							case 6: System.out.println("1: Please Enter new ZIP\n");
							int tempZip = cin.nextInt();
							((ParentUser)(users.get(i))).setZip(tempZip);;
							System.out.println("The updated ZIP is "+ ((ParentUser)(users.get(i))).getZip());
							default: System.out.println("Error: Invalid choice \n");
							}
						}
						else {
							System.out.println("Choose any of the Available data you would like to edit:");
							System.out.println("=========================================");
							System.out.println("1: First Name\n");
							System.out.println("2: Last Name\n");
							System.out.println("=========================================\n");
							System.out.print("Enter your choice: ");
							int choice1 = cin.nextInt();
							switch (choice1) {
							case 1: System.out.println("1: Please Enter new First Name\n");
							cin.nextLine();	
							String name = cin.nextLine();
							users.get(i).setFirstName(name);
							System.out.println("The updated first name is "+ users.get(i).getFirstName());

							case 2: System.out.println("1: Please Enter new Last Name\n");
							name = cin.nextLine();
							users.get(i).setLastName(name);
							System.out.println("The updated last name is "+ users.get(i).getLastName());


							default: System.out.println("Error: Invalid choice \n");
							}
						}
						break;
					}
				}

				break;
			case 6: //display all users
				for(int i=0; i<users.size();i++) {
					//System.out.println("works");
					if(users.get(i) instanceof ParentUser) {
						System.out.println(((ParentUser)(users.get(i))).toString());
					}
					else System.out.println(((ChildUser)(users.get(i))).toString());
				}


				break;
			default:
				System.out.print("Invalid entry\n");
			} 
		} 

	}
	
	static void save() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("yourFile.bin"));
			oos.writeObject(users);
			oos.close();
		} catch (Exception e) {
		}
	}

	public static void load() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("yourFile.bin"));
			users = (ArrayList<User>) ois.readObject();
			ois.close();
		} catch (Exception e) {
		}
	}
}

