package model;

<<<<<<< HEAD
import java.io.FileWriter;
import java.io.IOException;

=======
>>>>>>> 2cc28a33254dba5e4c18f866231ffde44135d435
public class Log {
	
	private static Log instance;	//variable for single log instance
	private StringBuffer logBuffer;	// SringBuffer to store log e vents
	
	
	private Log() {
		logBuffer = new StringBuffer();
	}
	
	//method to get log instances
	public static synchronized Log getInstance() {
		if ( instance == null) {
			instance = new Log();
		}
		
		return instance;
	}
	
	public void addEvent(String event){
		logBuffer.append(event).append("\n");
	}
	
	public String getLog() {
		return logBuffer.toString();
	}
	
	public void clearLog() {
		logBuffer.setLength(0);
	}
<<<<<<< HEAD
	
	public void logDeliveredParcelDetails(Customer customer, String parcelDetails, double totalFee) {
        logBuffer.append("===== Delivered Parcel Details =====\n")
                 .append("Customer Name: ").append(customer.getName()).append("\n")
                 .append("Parcels:\n").append(parcelDetails)
                 .append("Total Fee: $").append(totalFee).append("\n")
                 .append("====================================\n\n");
    }

    public void saveLogToFile(String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(logBuffer.toString());
        }
    }
=======
>>>>>>> 2cc28a33254dba5e4c18f866231ffde44135d435

}
