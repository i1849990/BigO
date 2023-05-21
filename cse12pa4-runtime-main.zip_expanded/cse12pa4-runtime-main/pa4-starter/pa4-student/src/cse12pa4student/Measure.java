package cse12pa4student;

import java.util.ArrayList;
import java.util.List;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		List<Measurement> a = new ArrayList<Measurement>();
		//Example call to mystery method
		
		for (int n = startN; n < stopN+1; n++) {
			switch(toRun[0]) {
				case "A":
					long startTime = System.nanoTime();
					Mystery.mysteryA(50);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("A", n, endTime));
					break;
					
				case "B":
					long startTime1 = System.nanoTime();
					Mystery.mysteryB(50);
					long endTime1 = System.nanoTime() - startTime1;
					a.add(new Measurement("B", n, endTime1));
					break;
					
				case "C":
					long startTime11 = System.nanoTime();
					Mystery.mysteryC(50);
					long endTime11 = System.nanoTime() - startTime11;
					a.add(new Measurement("C", n, endTime11));
					break;
					
				case "D":
					long startTime111 = System.nanoTime();
					Mystery.mysteryD(50);
					long endTime111 = System.nanoTime() - startTime111;
					a.add(new Measurement("D", n, endTime111));
					break;
					
				case "E":
					long startTime1111 = System.nanoTime();
					Mystery.mysteryE(50);
					long endTime1111 = System.nanoTime() - startTime1111;
					a.add(new Measurement("E", n, endTime1111));
					break;
					
				case "F":
					long startTime11111 = System.nanoTime();
					Mystery.mysteryF(50);
					long endTime11111 = System.nanoTime() - startTime11111;
					a.add(new Measurement("F", n, endTime11111));
					break;
					
				
			}
			
		}
		return null;
	}
	
	
	

	public static void measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		
		
		for (int i = 0; i < toConvert.size(); i++) {
			System.out.println(toConvert.get(i).toString());
		}
	}
	
	/* Add any helper methods you find useful */
		
}
