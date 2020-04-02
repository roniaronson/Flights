package Terminal3;

import java.io.PrintWriter;

import Terminal3.Flight.eStatus;

public class TimeTable {
	
	private Flight[]allFlights=new Flight [counter];
	private static int counter=100;
	private static int numberOfFlights=0;
	
	public TimeTable() {
	}
	
	public void addFlight(Flight newFlight) {
		if(numberOfFlights==allFlights.length) {
			extandArray();
		}
		allFlights[numberOfFlights]=newFlight;
		numberOfFlights++;
	}
	//להגדיל את מערך הטיסות
	public void extandArray() {
		counter=counter*2;
		
	}
	public void showFlights() {
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null)
				allFlights[i].toString();
			System.out.println();
		}
	}
	public void save(PrintWriter pw) {
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				allFlights[i].save(pw);
			}
		}
	}
}
