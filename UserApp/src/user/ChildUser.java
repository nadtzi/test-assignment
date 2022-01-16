package user;


public class ChildUser extends User{

	private long parentID;
	public ChildUser(String fname, String lname, long parentID) {
		super(fname, lname);
		this.parentID = parentID;
	}
	@Override
	public String toString() {
		return super.toString()+"ChildUser [parent=" + parentID + "]";
	}
	public long getParent() {
		return parentID;
	}

}
