package MainView;

public class customer {
	
	private String firstName;
	
	private String middleInitial;
	
	private String lastName;
	
	private String gender;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	public customer(String firstName, String middleInitial, String lastName, String gender, String address, String city, String state, String zip){
		this.firstName = new String(firstName);
		this.middleInitial =  new String(middleInitial);
		this.lastName = new String(lastName);
		this.gender = new String(gender);
		this.address = new String(address);
		this.city = new String(city);
		this.state = new String(state);
		this.zip = new String(zip);
	}

	public customer() {
	}


	public String getFirstName() {
		return firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	
	
}
