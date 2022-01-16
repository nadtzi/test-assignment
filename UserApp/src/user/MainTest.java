package user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class MainTest {

	 
	
	
	public static void main(String[] args) {
		ArrayList <User> userData = new ArrayList<User>(100);
		ParentUser p1 = new ParentUser ("Nahidul", "islam", "Street", "City", "state", 1234 );
		ParentUser p2 = new ParentUser ("deez", "nutz", "Street2", "City2", "state2", 1111 );
		ChildUser c1 = new ChildUser ("deez", "nutz", p1.getUID());
		
		
	
		
		System.out.println(p1);
		System.out.println(c1);
		
	}
	
	
	/*
	 * static void save() { try { ObjectOutputStream oos = new
	 * ObjectOutputStream(new FileOutputStream("yourFile.bin")); oos.writeObject(t);
	 * oos.close(); } catch (Exception e) { } }
	 * 
	 * public static void load() { try { ObjectInputStream ois = new
	 * ObjectInputStream(new FileInputStream("yourFile.bin")); t = (User)
	 * ois.readObject(); ois.close(); } catch (Exception e) { } }
	 */
}
