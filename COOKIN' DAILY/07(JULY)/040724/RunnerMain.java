package runner;

import runner_approach3.Runner_Approach_Three;

public class RunnerMain {
	public static void main(String[] args) {
//		Runner r1 = new Runner();
//		r1.initialise( "jesse", 2, 15.0);
//		r1.displayRunnerDetails();
//		System.out.println("\n");
//		Runner r2 = new Runner();
//		r2.initialise("jess", 4, 14.0);
//		r2.displayRunnerDetails();
		
		Runner_Approach_Three a1 = new Runner_Approach_Three();
		a1.initialise(2, 11.0, "jesse");
		a1.displayRunnerDetails();
		Runner_Approach_Three a2 = new Runner_Approach_Three();
		a2.initialise(3, 10.0, "mother");
		a2.displayRunnerDetails();
		Runner_Approach_Three a3 = new Runner_Approach_Three();
		a3.initialise(7, 15.0, "father");
		a3.displayRunnerDetails();
		
	
//		Runner_with_Logic l1 = new Runner_with_Logic();
//		l1.initialise(2, 11.0, "popeye");
//		l1.displayRunnerDetails();
//		Runner_with_Logic l2 = new Runner_with_Logic();
//		l2.initialise(3, 12.0, "jesse");
//		l2.displayRunnerDetails();
//		Runner_with_Logic l3 = new Runner_with_Logic();
//		l3.initialise(4, 14.0, "courage");
//		l3.displayRunnerDetails();
	}
}