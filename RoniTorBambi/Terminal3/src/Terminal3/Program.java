package Terminal3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		File f=new File("Terminal3.txt");
		PrintWriter pw=new PrintWriter(f);
		TimeTable terminal3 = new TimeTable();
		int choice = scan.nextInt();
		boolean exitCase = false;
		while (exitCase == false) {
			switch (choice) {
			case 1:
				terminal3.showFlights();
				break;
			case 2:
				terminal3.addFlight(new Flight(scan));
				break;
			case 3:
				//בחירה של לשמור את כל הנתונים של הטיסות- לא אמור להיות פה אבל נשנה בהמשך
				terminal3.save(pw);
				break;
			case 4:
				// exit
				exitCase = true;
				break;
			}

	}
	}
}
