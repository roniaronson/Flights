package Terminal3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		File f=new File("Terminal3.txt");
		Scanner scanFile= new Scanner(f);
		PrintWriter pw=new PrintWriter(f);
		TimeTable terminal3 = new TimeTable();
		
		boolean exitCase = false;
		
		while (exitCase == false) {
			System.out.println("enter your choise: 1-enter new flight details 2-show all departures details 3-show all arrivals details 4-save flights details 5-import from file -1-Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				terminal3.addFlight(new Flight(scan));
				break;
			case 2:
				System.out.println(terminal3.showDeparturesFlights());
				break;
			case 3:
				// המטודה לא מחזירה כלום- זו הבעיה!!!!!!!!!
				System.out.println(terminal3.showArrivalsFlights());
				break;
			case 4:
				terminal3.save(pw);
				break;
			case 5:
				TimeTable newTerminal = new TimeTable(scanFile, true);
				break;
			case -1:
				exitCase = true;
				break;
			}

	}
	}
}
