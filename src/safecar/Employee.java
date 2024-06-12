package safecar;

abstract class Employee {
	private String name;
	private String email;
	private String role;

	public Employee(String name, String email, String role) {
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public void performTask() {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getRole() {
		return this.role;
	}
	
	public void PrintData() {
		System.out.println("Name: " + this.name);
		System.out.println("email: " + this.email);
		System.out.println("role: " + this.role);
	}
}