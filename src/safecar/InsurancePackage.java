package safecar;

class InsurancePackage {
	private String packageName;
	private double cost;
	private String coverageDetails;

	public InsurancePackage(String packageName, double cost, String coverageDetails) {
		this.packageName = packageName;
		this.cost = cost;
		this.coverageDetails = coverageDetails;
	}
	
	public void PrintData() {
		System.out.println("package name: " + this.packageName);
		System.out.println("Cost: " + this.cost);
		System.out.println("Coverage Details: " + this.coverageDetails);
	}

	public String getPackageName() {
		return this.packageName;
	}

	public double getCost() {
		return this.cost;
	}

	public String getCoverageDetails() {
		return this.coverageDetails;
	}
}