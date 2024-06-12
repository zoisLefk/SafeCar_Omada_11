package safecar;

class Customer {
	private String name;
	private String lastName;
	private String phone;
	private String email;
	private String identityNumber;
	
	public void PrintData() {
		System.out.println("Name: " + this.name);
		System.out.println("lastName: " + this.lastName);
		System.out.println("phone: " + this.name);
		System.out.println("email: " + this.name);
		System.out.println("identityNumber: " + this.identityNumber);
	}

	public Customer(String name, String lastName, String phone, String email, String identityNumber) {
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

	public String getIdentityNumber() {
		return this.identityNumber;
	}
}