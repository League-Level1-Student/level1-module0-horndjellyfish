public class CoolCat {

	private String name;
	private int mice = 9;

	CoolCat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void steal() {
		mice--;
		if (mice == 1)
			System.out.println("Nice try, but I still have " + mice + " mouse left.");
		if (mice > 1)
			System.out.println("Nice try, but I still have " + mice + " mice left.");
		else if (mice < 0)
			System.out.println("That's overkill!");
		else if (mice == 0)
			System.out.println("No mice left :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		CoolCat delilah = new CoolCat("Delilah");
		delilah.meow();
		// 2. Get the Cat to print its name
		delilah.printName();
		// 3. Steal all the Cat's mice!
		for (int i = 0; i < 9; i++) {
			delilah.steal();
		}

	}
}
