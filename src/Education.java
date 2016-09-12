
public class Education {
	private String schools[] = new String[10];

	public String[] getSchools() {
		return schools;
	}

	public void setSchools(String[] schools) {
		this.schools = schools;
	}

	public String toString() {
		String sArray = "";
		for (String s : schools)
			sArray = sArray + s+", ";
		return (sArray);
	}
}
