package model;

public class Worker {
	
	private String workerId;
	private String name;
	private double feePerDay, feePerKg;
	
	
	
	public String getWorkerId() {
		return workerId;
	}


	public Worker(String workerId, String name, double feePerDay, double feePerKg) {
		super();
		this.workerId = workerId;
		this.name = name;
		this.feePerDay = feePerDay;
		this.feePerKg = feePerKg;
	}
	
	public double processCustomers(Customer customer, Parcel parcel) {
		
		if(customer == null || parcel == null) {
			System.out.println("No parcels or customers. Cannot process.");
			return 0;
		}
		double fee = calculateFee(parcel);
		System.out.println("Processing Customer: " + customer.getLastName());
        System.out.println("Parcel Details: " + parcel);
        System.out.println("Calculated Fee: $" + fee);

        // Release parcel logic (e.g., mark as processed)
        releaseParcel(parcel);

        return fee;
	}
	
	private double calculateFee(Parcel parcel) {
		
		return parcel.getDaysInDepot() * feePerDay;
	}
	
	private void releaseParcel(Parcel parcel) {
        System.out.println("Parcel with ID " + parcel.getParcelID() + " has been released.");
       
    }
	
	

}
