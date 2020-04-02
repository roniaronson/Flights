package Terminal3;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Flight {
	public enum eStatus {
		landed, Sofi, loSofi, Canceled
	};

	private String flightNumber;
	private String destination;
	private String origin;
	private String company;
	private String arrivalDate;
	private String arrivalTime;
	private String takeOff;
	private eStatus status;

	public Flight(String flightNumber, String destination, String origin, String company, String arrivalTime,
			String takeOff, String status) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.company = company;
		this.arrivalTime = arrivalTime;
		this.takeOff = takeOff;
		this.status = eStatus.valueOf(status);
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
		System.out.println("Enter arrival time: ");
		this.arrivalTime = scan.next();
		System.out.println("Enter takeOff: ");
		this.takeOff = scan.next();
		System.out.println("Enter status: ");
		this.status = eStatus.valueOf(scan.next());
	}
	public void save(PrintWriter pw) {
		pw.print(this.flightNumber+"\n");
		pw.print(this.destination+"\n");
		pw.print(this.origin+"\n");
		pw.print(this.company+"\n");
		pw.print(this.arrivalTime+"\n");
		pw.print(this.takeOff+"\n");
		pw.print(this.status.name()+"\n");
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", destination=" + destination + ", origin=" + origin
				+ ", company=" + company + ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime
				+ ", takeOff=" + takeOff + ", status=" + status + "]";
	}

}
