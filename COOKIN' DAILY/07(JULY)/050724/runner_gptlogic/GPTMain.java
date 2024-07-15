package runner_gptlogic;

public class GPTMain {
	public static void main(String[] args) {
		Runner_GPTLogic a1 = new Runner_GPTLogic();
		a1.initialise(2, 11.0, "jesse");
		a1.displayRunnerDetails();
		Runner_GPTLogic a2 = new Runner_GPTLogic();
		a2.initialise(3, 10.0, "mother");
		a2.displayRunnerDetails();
		Runner_GPTLogic a3 = new Runner_GPTLogic();
		a3.initialise(7, 15.0, "father");
		a3.displayRunnerDetails();
	}
}
