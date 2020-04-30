package Terminal3;

import java.io.PrintWriter;
import java.util.Scanner;

import Terminal3.Flight.eStatus;

public class TimeTable {
	
	private Flight[]allFlights=new Flight [counter];
	private static int counter=100;
	private static int numberOfFlights=0;
	
	public TimeTable() {
	}
	public TimeTable(Scanner scan, boolean t) {
		int counter=scan.nextInt();
		for (int i = 0; i < counter; i++) {
			Flight newFlight=new Flight(scan,t);
			addFlight(newFlight);
		}
	}
	public void addFlight(Flight newFlight) {
		if(numberOfFlights==allFlights.length) {
			extandArray();
		}
		allFlights[numberOfFlights]=newFlight;
		numberOfFlights++;
		System.out.println("thank you");
	}
	//להגדיל את מערך הטיסות
	public void extandArray() {
		counter=counter*2;
	}
	public String showDeparturesFlights() {
		sortByDate();
		sortByTime();
		StringBuffer allFlightss=new StringBuffer("");
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null)
				if(allFlights[i].getType().name().equalsIgnoreCase("Departure")) {
						allFlightss.append(allFlights[i].toString()+"\n");
						
				}
			}
		return allFlightss.toString();
		}
	
	public String showArrivalsFlights() {
		sortByDate();
		sortByTime();
		StringBuffer allFlightss=new StringBuffer("");
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null)
				if(allFlights[i].getType().name().equalsIgnoreCase("Arrivals")) {
					allFlightss.append(allFlights[i].toString()+"\n");
				}
			}
		return allFlightss.toString();
		}
	
	public void sortByDate() {
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				for (int j = i+1; j < allFlights.length; j++) {
					if(allFlights[j]!=null) {
						if(allFlights[i].getArrivalDate().getYear()>allFlights[j].getArrivalDate().getYear())
							swap(i,j);
					}
				}
			}
		}
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				for (int j = i+1; j < allFlights.length; j++) {
					if(allFlights[j]!=null) {
						if(allFlights[i].getArrivalDate().getMonth()>allFlights[j].getArrivalDate().getMonth())
							swap(i,j);
					}
				}
			}
		}
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				for (int j = i+1; j < allFlights.length; j++) {
					if(allFlights[j]!=null) {
						if(allFlights[i].getArrivalDate().getDay()>allFlights[j].getArrivalDate().getDay())
							swap(i,j);
					}
				}
			}
		}
	}
	public void sortByTime() {
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				for (int j = i+1; j < allFlights.length; j++) {
					if(allFlights[j]!=null) {
						if(allFlights[i].getTakeOffTime().getHour()>allFlights[j].getTakeOffTime().getHour())
							swap(i,j);
					}
				}
			}
		}
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				for (int j = i+1; j < allFlights.length; j++) {
					if(allFlights[j]!=null) {
						if(allFlights[i].getTakeOffTime().getMinute()>allFlights[j].getTakeOffTime().getMinute())
							swap(i,j);
					}
				}
			}
		}
	}
	public void swap( int i, int j) {
		Flight temp = allFlights[i];
		allFlights[i] = allFlights[j];
		allFlights[j] = temp;
	}

	public void save(PrintWriter pw) {
		pw.print(numberOfFlights);
		for (int i = 0; i < allFlights.length; i++) {
			if(allFlights[i]!=null) {
				allFlights[i].save(pw);
			}
		}
	}
	
}
