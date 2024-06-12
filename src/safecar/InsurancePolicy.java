package safecar;

class InsurancePolicy {
	private String policyCode;
	private String description;
	private int duration;

	public InsurancePolicy(String policyCode, String description, int duration) {
		this.policyCode = policyCode;
		this.description = description;
		this.duration = duration;
	}

	public void PrintData() {
		System.out.println("Policy Code: " + this.policyCode);
		System.out.println("Description: " + this.description);
		System.out.println("Duration: " + this.duration);
	}
	
	public String getPolicyCode() {
		return this.policyCode;
	}

	public String getDescription() {
		return this.description;
	}

	public int getDuration() {
		return this.duration;
	}
}
