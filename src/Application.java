
class Whatever extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("@@& doing something: " + i); // job mixed....
		}

	}
}

public class Application {

	public static void main(String[] args) { // this is the main thread. threads run in sequence.

		System.out.println("--Beggining of the program--"); // job 1

		new Whatever().start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("££ printing stuff: " + i); // job 2

		}

		System.out.println("--Program finished--"); // job 3
	}

}
