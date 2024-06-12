package safecar;

class Vehicle {
	private String mark;
	private String model;
	private String plateNumber;
	private int year;
	private String chassisNumber;

	public Vehicle(String mark, String model, String plateNumber, int year, String chassisNumber) {
		this.mark = mark;
		this.model = model;
		this.plateNumber = plateNumber;
		this.year = year;
		this.chassisNumber = chassisNumber;
	}
	
	public void PrintData() {
		System.out.println("Mark: " + this.mark);
		System.out.println("Model: " + this.model);
		System.out.println("plateNumber: " + this.plateNumber);
		System.out.println("Year: " + this.year);
		System.out.println("Chassis Number: " + this.chassisNumber);
	}

	public String getMake() {
		return this.mark;
	}

	public String getModel() {
		return this.model;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public int getYear() {
		return this.year;
	}

	public String getChassisNumber() {
		return this.chassisNumber;
	}
}