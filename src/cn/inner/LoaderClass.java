package cn.inner;

public class LoaderClass {
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
		Outter a = new Outter();
		Outter.Inner b = a.new Inner();
	}

}

class Character {
	private String s;

	Character(String s) {
		this.s = s;
		System.out.println("create Character " + s);
	}

	protected void dispose() {
		System.out.println("dispose Character " + s);
	}
}

class Descrip {
	private String s;

	Descrip(String s) {
		this.s = s;
		System.out.println("create descrip " + s);
	}

	protected void dispose() {
		System.out.println(" dispose descrip " + s);
	}
}

class LiveCreature {
	private static String str = getStrContent();
	private Character p = new Character("is alive");
	private Descrip t = new Descrip("Base Live Creature");

	LiveCreature() {
		System.out.println("LiveCreature");
	}

	protected void dispose() {
		System.out.println("LIveCreature dispose");
		t.dispose();
		p.dispose();
	}
	public static String getStrContent() {
		System.out.println("LiveCreature");
		return "LiveCreature";
	}
}

class Animal extends LiveCreature {
	private static String str = getStrContent();
	private Character p = new Character("has heart");
	private Descrip t = new Descrip("Animal not Vegetable");

	Animal() {
		System.out.println("Animal");
	}

	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static String getStrContent() {
		System.out.println("Animal");
		return "Animal";
	}
}

class Amphibian extends LiveCreature {
	private static String str = getStrContent();
	private Character p = new Character("can live in water");
	private Descrip t = new Descrip("Both water and land");

	Amphibian() {
		System.out.println("Amphibian");
	}

	protected void dispose() {
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static String getStrContent() {
		System.out.println("Amphibian");
		return "Amphibian";
	}
}

class Frog extends Amphibian {
	private static String str = getStrContent();
	private Character p = new Character("croaks");
	private Descrip t = new Descrip("eates bugs");

	Frog() {
		System.out.println("Frog");
	}

	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static String getStrContent() {
		System.out.println("Frog");
		return "Frog";

	}
}
