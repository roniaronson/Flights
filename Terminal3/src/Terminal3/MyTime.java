package Terminal3;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MyTime {

		private int hour, minute;
		
		public MyTime(int hour, int minute) {
			if(hour<0||hour>23)
				hour=0;
			this.hour=hour;
			if(minute<0||minute>60)
				minute=0;
			this.minute=minute;		
		}
		public int getHour() {
			return this.hour;
		}
		public int getMinute() {
			return this.minute;
		}
		public String getTime() {
			return hour+":"+minute;
		}
		public void save(PrintWriter pw) {
			pw.print(this.hour+", ");
			pw.print(this.minute+", ");
		}
		public MyTime(Scanner scan) {
			System.out.println("enter hour:(00-23)");
			this.hour=scan.nextInt();
			System.out.println("enter minute:(00-59)");
			this.minute=scan.nextInt();
		}
		public MyTime(Scanner scan, boolean t) {
			this.hour=scan.nextInt();
			this.minute=scan.nextInt();
			scan.nextLine();
		}
		public String toString() {
			return (this.hour+":"+this.minute);
		}
	}






