package safecar;

import java.util.ArrayList;

public class SafeCar {

	public static void main(String[] args) {
		InsuranceAgency agency = new InsuranceAgency("agency1", "Address");
        Employee admin = new AdministrativeStaff("Admin", "admin@example.com");
        Employee agent = new InsuranceAgent("Agent", "agent@example.com");
        Employee collaborator = new ExternalCollaborator("Collaborator", "collaborator@example.com");
        Employee expert = new Expert("Expert", "expert@example.com");

        agency.addEmployee(admin);
        agency.addEmployee(agent);
        agency.addEmployee(collaborator);
        agency.addEmployee(expert);

        addCustomer(agency.getCustomers(), new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432"));
        addCustomer(agency.getCustomers(), new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO79432"));
        addCustomer(agency.getCustomers(), new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO79432"));

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        addVehicle(vehicles, new Vehicle("Mercedes", "GLC", "XKP8923", 2020, "7C3FR76A515072256"));
        addVehicle(vehicles, new Vehicle("Subaru", "Forester", "NII4269", 2018, "7C3FR76A555071465"));
        addVehicle(vehicles, new Vehicle("Ford", "Ranger", "KOH4681", 2022, "7C3FR76A55504645"));

        ArrayList<InsurancePolicy> insurancePolicies = new ArrayList<>();
        insurancePolicies.add(new InsurancePolicy("ΜI93", "Mikti asfalisi", 6));
        System.out.println("New insurance policy has been created");
        insurancePolicies.add(new InsurancePolicy("B56", "Basiki asfalisi", 6));
        System.out.println("New insurance policy has been created");
        insurancePolicies.add(new InsurancePolicy("O58", "Me odiki", 6));
        System.out.println("New insurance policy has been created");

        ArrayList<InsuranceContract> insuranceContracts = new ArrayList<>();
        insuranceContracts.add(new InsuranceContract(agency.getCustomers().get(0), vehicles.get(0), insurancePolicies.get(1), 60));
        insuranceContracts.add(new InsuranceContract(agency.getCustomers().get(1), vehicles.get(1), insurancePolicies.get(0), 120));
        insuranceContracts.add(new InsuranceContract(agency.getCustomers().get(1), vehicles.get(2), insurancePolicies.get(2), 80));

        for (InsuranceContract contract : insuranceContracts) {
            System.out.printf("%s %s %s %d%n", contract.getCustomer().getName(),
                    contract.getVehicle().getPlateNumber(),
                    contract.getInsurancePolicy().getDescription(),
                    contract.getCost());
        }

        for (Customer customer : agency.getCustomers()) {
            double totalCost = 0;
            System.out.print(customer.getName() + " has insured vehicles: ");
            for (InsuranceContract contract : insuranceContracts) {
                if (contract.getCustomer().equals(customer)) {
                    System.out.print(contract.getVehicle().getPlateNumber() + " ");
                    totalCost += contract.getCost();
                }
            }
            System.out.println("with total insurance cost: " + totalCost);
        }
	}
	
	private static void addCustomer(ArrayList<Customer> customers, Customer newCustomer) {
        for (Customer customer : customers) {
            if (customer.getIdentityNumber().equals(newCustomer.getIdentityNumber())) {
                System.out.println("Duplicate customer ID found: " + newCustomer.getIdentityNumber());
                return;
            }
        }
        customers.add(newCustomer);
        
        System.out.println("Customer has been created successfully");
    }

    private static void addVehicle(ArrayList<Vehicle> vehicles, Vehicle newVehicle) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getChassisNumber().equals(newVehicle.getChassisNumber())) {
                System.out.println("Duplicate vehicle chassis number found: " + newVehicle.getChassisNumber());
                return;
            }
        }
        vehicles.add(newVehicle);
        System.out.println("Vehicle has been succesfully created");
    }

}
