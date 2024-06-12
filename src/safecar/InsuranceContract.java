package safecar;

class InsuranceContract {
	private Customer customer;
	private Vehicle vehicle;
	private InsurancePolicy insurancePolicy;
	private double cost;

	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurancePolicy, double cost) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.insurancePolicy = insurancePolicy;
		this.cost = cost;
	}
	
	public void PrintData() {
		this.customer.PrintData();
		this.vehicle.PrintData();
		this.insurancePolicy.PrintData();
		System.out.println("Cost: " + cost);
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public InsurancePolicy getInsurancePolicy() {
		return this.insurancePolicy;
	}

	public double getCost() {
		return this.cost;
	}
}
