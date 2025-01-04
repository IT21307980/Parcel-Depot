package model;

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

}
