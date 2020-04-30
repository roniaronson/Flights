package Terminal3;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Flight {
	public enum eStatus {
		landed, Sofi, loSofi, Canceled
	};
	public enum Type {Arrival, Departure};

	private String flightNumber;
	private String destination;
	private String origin;
	private String company;
	private MyDate arrivalDate;
	private MyTime arrivalTime;
	private MyTime takeOffTime;
	private eStatus status;
	private Type type;

	public Flight(String flightNumber, String destination, String origin, String company, MyDate arrivalDate, MyTime arrivalTime,
			MyTime takeOffTime, String status) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.company = company;
		this.arrivalDate=arrivalDate;
		this.arrivalTime = arrivalTime;
		this.takeOffTime = takeOffTime;
		this.status = eStatus.valueOf(status);
		if(this.origin.equalsIgnoreCase("israel"))
			this.type=Type.valueOf("Departure");
		else
			this.type=Type.valueOf("Arrival");
	}
	
	public Flight(Scanner scan) {
		System.out.println("Enter flight number: ");
		this.flightNumber = scan.next();
		System.out.println("Enter destination: ");
		this.destination = scan.next();
		System.out.println("Enter origin: ");
		this.origin = scan.next();
		System.out.println("Enter company: ");
		this.company = scan.next();
		System.out.println("Enter arrival date: ");
		MyDate arrivalDate=new MyDate(scan);
		this.arrivalDate = arrivalDate;
		System.out.println("Enter arrival time: ");
		MyTime arrivalTime=new MyTime(scan);
		this.arrivalTime = arrivalTime;
		System.out.println("Enter takeOff time: ");
		MyTime takeOffTime=new MyTime(scan);
		this.takeOffTime = takeOffTime;
		System.out.println("Enter status: (Landed, Sofi, LoSofi, Canceled)");
		this.status = eStatus.valueOf(scan.next());
		if(this.origin.equalsIgnoreCase("israel"))
			this.type=Type.valueOf("Departure");
		else
			this.type=Type.valueOf("Arrival");
	}
	public Flight(Scanner scan, boolean t) {
		this.flightNumber = scan.nextLine();
		this.destination = scan.nextLine();
		this.origin = scan.nextLine();
		this.company = scan.nextLine();
		MyDate arrivalDate=new MyDate(scan,true);
		this.arrivalDate = arrivalDate;
		MyTime arrivalTime=new MyTime(scan, true);
		this.arrivalTime = arrivalTime;
		MyTime takeOffTime=new MyTime(scan, true);
		this.takeOffTime = takeOffTime;
		this.status = eStatus.valueOf(scan.nextLine());
	}
	public void save(PrintWriter pw) {
		pw.print(this.flightNumber+"\n");
		pw.print(this.destination+"\n");
		pw.print(this.origin+"\n");
		pw.print(this.company+"\n");
		pw.print(this.arrivalDate+"\n");
		pw.print(this.arrivalTime+"\n");
		pw.print(this.takeOffTime+"\n");
		pw.print(this.status.name()+"\n");
	}
	public MyDate getArrivalDate() {
		return this.arrivalDate;
	}
	public MyTime getArrivalTime() {
		return this.arrivalTime;
	}
	public Type getType() {
		return this.type;
	}
	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public String getOrigin() {
		return origin;
	}

	public String getCompany() {
		return company;
	}

	public MyTime getTakeOffTime() {
		return takeOffTime;
	}

	public eStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return ("Flight Number: " + this.flightNumber + "\n" + "Destination: " + this.destination + "\n" + "Origin: "
				+ this.origin + "\n" + "Company: " + this.company + "\n" + "Arrival Date: " + this.arrivalDate + "\n"
				+ "Arrival Time: " + this.arrivalTime + "\n" + "TakeOff Time: " + this.takeOffTime + "\n" + "Status: "
				+ this.status.name() + "\n");
	}

}
