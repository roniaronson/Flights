package Terminal3;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	

		@Test
		public void statementTest1() {
			Flight london = createFlight1();
			Flight newYork = createFlight2();
			TimeTable terminal3 = new TimeTable();
			terminal3.addFlight(newYork);
			terminal3.addFlight(london);
			StringBuffer expectedResult = new StringBuffer();
			//לסדר לפי הקונסטרקטור של פלייט
			expectedResult.append("Flight Number: "+newYork.getFlightNumber()+"\n");
			expectedResult.append("Destination: "+newYork.getDestination()+"\n");
			expectedResult.append("Origin: "+newYork.getOrigin()+"\n");
			expectedResult.append("Company: "+newYork.getCompany()+"\n");
			expectedResult.append("Arrival Date: "+newYork.getArrivalDate()+"\n");
			expectedResult.append("Arrival Time: "+newYork.getArrivalTime()+"\n");
			expectedResult.append("TakeOff Time: "+newYork.getTakeOffTime()+"\n");
			expectedResult.append("Status: "+newYork.getStatus().name()+"\n");
			expectedResult.append("Flight Number: "+london.getFlightNumber()+"\n");
			expectedResult.append("Destination: "+london.getDestination()+"\n");
			expectedResult.append("Origin: "+london.getOrigin()+"\n");
			expectedResult.append("Company: "+london.getCompany()+"\n");
			expectedResult.append("Arrival Date: "+london.getArrivalDate()+"\n");
			expectedResult.append("Arrival Time: "+london.getArrivalTime()+"\n");
			expectedResult.append("TakeOff Time: "+london.getTakeOffTime()+"\n");
			expectedResult.append("Status: "+london.getStatus().name()+"\n");
			
			

			assertEquals(expectedResult.toString(), terminal3.showArrivalsFlights());
		}
		
		private Flight createFlight1() {
			MyDate londonDate=new MyDate(20,5,2020);
			MyTime londonTakeOff=new MyTime(10,10);
			Flight london = new Flight("LY315", "London","Israel","El-Al",londonDate,null,londonTakeOff,"Sofi");
			return london;
			
		}
		private Flight createFlight2() {
			MyDate newYorkDate=new MyDate(20,5,2020);
			MyTime newYorkTakeOff=new MyTime(0,45);
			Flight newYork = new Flight("LY3001", "NewYork","Israel","El-Al",newYorkDate,null,newYorkTakeOff,"Sofi");
			return newYork;
		}
}
