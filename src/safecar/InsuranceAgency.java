package safecar;

import java.util.ArrayList;
import java.util.List;

class InsuranceAgency {
	private String name;
	private String address;
	private ArrayList<Employee> employees = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<InsurancePackage> insurancePackages = new ArrayList<>();
	
	public void PrintData() {
		System.out.println("Name: " + this.name);
		System.out.println("address" + this.address);
		
		for (Employee employee : this.employees) {
			employee.PrintData();
		}
		for (Customer customer: this.customers) {
			customer.PrintData();
		}
		for (InsurancePackage insurance_package : this.insurancePackages) {
			insurance_package.PrintData();
		}
	}

	public InsuranceAgency(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public java.util.ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
		System.out.println("Empolyee " + employee.getName() + " has craeted succesfully");
	}

	public java.util.ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public java.util.ArrayList<InsurancePackage> getInsurancePackages() {
		return insurancePackages;
	}

	public void addInsurancePackages(InsurancePackage insurancePackage) {
		this.insurancePackages.add(insurancePackage);
	}

	
}