
public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(handy.getHatColor());
	System.out.println(handy.isGirlOrBoy());
	Smurf papa = new Smurf("Papa");
	System.out.println(papa.getName());
	papa.eat();
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	Smurf dog = new Smurf("Smurfette");
	System.out.println(dog.getName());
	dog.eat();
	System.out.println(dog.getHatColor());
	System.out.println(dog.isGirlOrBoy());
}
}
