package cse12pa4student;

import java.util.ArrayList;
import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		List<Measurement> a = new ArrayList<Measurement>();
		//Example call to mystery method
		int n = startN;
		while(n <= stopN) {
			for (int i = 0; i < toRun.length; i++) {
				if (i == 0) {
					long startTime = System.nanoTime();
					Mystery.mysteryA(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("A", n, endTime));
				}else if(i ==1) {
					long startTime = System.nanoTime();
					Mystery.mysteryB(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("B", n, endTime));
					
				}else if(i == 2) {
					long startTime = System.nanoTime();
					Mystery.mysteryC(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("C", n, endTime));
					
				}else if (i == 3) {
					long startTime = System.nanoTime();
					Mystery.mysteryD(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("D", n, endTime));
					
				}else if(i == 4) {
					long startTime = System.nanoTime();
					Mystery.mysteryE(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("E", n, endTime));
				}else if(i == 5) {
					long startTime = System.nanoTime();
					Mystery.mysteryF(n);
					long endTime = System.nanoTime() - startTime;
					
					a.add(new Measurement("F", n, endTime));
				}
			}
			long startTime = System.nanoTime();
			
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
