package IntroToObjects;

public class Hedgehog {
	int numberOfFriends = 2;
	String favoriteFood = "worms";
	Hedgehog(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	void dig() {
		System.out.println("*dig*");
		
	}
	void lickQuills() {
		System.out.println("*lick quill*");
	}
}
