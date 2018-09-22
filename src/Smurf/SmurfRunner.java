package Smurf;

public class SmurfRunner {
	public static void main(String [] args) {
		Smurf handy = new Smurf("Handy Smurf");
		handy.getName();
		handy.eat();
		System.out.println(" ");
		Smurf papa = new Smurf("Papa Smurf");
		papa.getName();
		String c = papa.getHatColor("red");
		System.out.println(c);
		String g = papa.isGirlOrBoy("boy");
		System.out.println(g);
		System.out.println(" ");
		Smurf smurfette = new Smurf("Smurfette");
		smurfette.getName();
		String c2 = smurfette.getHatColor("white");
		System.out.println(c2);
		String g2 = smurfette.isGirlOrBoy("girl");
		System.out.println(g2);
	}
}
