package model;

import java.util.HashMap;
import java.util.Map;

public class ParcelMap {

	private Map<String, Parcel> parcelMap;	//Map to store parcels with id
	
	
	//Constructor
	public ParcelMap(Map<String, Parcel> parcelMap) {
		parcelMap = new HashMap<>();
	}
	
	public void addParcel(Parcel parcel) {
		if(parcelMap.containsKey(parcel.getParcelID())) {
			System.out.println("Parcel with ID " + parcel.getParcelID() + "already exists.");
		}
		else {
			parcelMap.put(parcel.getParcelID(), parcel);
			System.out.println("Parcel added: " + parcel);
		}
	}
	
	public Parcel getParcel(String id) {
		return parcelMap.get(id);
	}
	
	public void removeParcel(String id) {
		if(parcelMap.remove(id) != null) {
			parcelMap.remove(id);
			System.out.println("Parcel removed successfully.");
		}
		else {
			System.out.println("No parcel found with the ID " + id);
		}
	}
	
}
