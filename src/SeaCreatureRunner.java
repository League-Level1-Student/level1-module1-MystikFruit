
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature bob = new SeaCreature("Spongebob");
	System.out.println(bob.getName());
	bob.eat();
	bob.laugh();
	SeaCreature patrick = new SeaCreature("Patrick");
	System.out.println(patrick.getName());
	patrick.eat();
	patrick.laugh();
	SeaCreature squid = new SeaCreature("Squidward");
	System.out.println(squid.getName());
	squid.eat();
	squid.laugh();
	
}
}
