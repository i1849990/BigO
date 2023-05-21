package cse12pa4student;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Measure m = new Measure();
		String[] test = {"A","B", "C", "D", "E", "F"};
		List<Measurement> happy = Measure.measure(test, 40, 100);
				
		System.out.println(happy.get(0).toString());
		//Measure.measurementsToCSV(Measure.measure(test, 40, 100));
	}

}
