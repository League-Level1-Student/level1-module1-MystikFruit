/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;
	private String hat;
	private String gb;
	private String name2;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		if (name.equals("Smurfette")) {
			name2 = "";
		} else {
			name2 = " Smurf";
		}
		return "My name is " + name + name2+".";
	}

	public void eat() {
		System.out.println(name + name2 +" is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (name.equals("Papa")) {
			hat = "red";
		} else {
			hat = "white";
		}
		return "My hat is " + hat + ".";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (name.equals("Smurfette")) {
			gb = "girl";
		} else {
			gb = "boy";
		}
		return "I am a " + gb + ".";
	}

}
