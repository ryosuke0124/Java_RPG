package pac01;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.hp);
		System.out.println(h1.name);

		Hero h2 = new Hero();
		System.out.println(h2.hp);
		System.out.println(h2.name);

		SuperHero sh = new SuperHero("進化したミナト");
		sh.run();

		Sword s1 = new Sword();
		s1.name = "炎の剣";
		s1.damage = 10;
		h1.sword = s1;
		System.out.println(h1.name + "の現在の武器は" + h1.sword.name + "です！");

		Sword s2 = new Sword();
		s2.name = "ショットガン";
		s2.damage = 20;
		h2.sword = s2;
		System.out.println(h2.name + "の現在の武器は" + h2.sword.name + "です！");

		Sword s3 = new Sword();
		s3.name = "魔王剣";
		s3.damage = 100;
		sh.sword = s3;
		System.out.println(sh.name + "の現在の武器は" + sh.sword.name + "です！");

		//Hero h1 = new Hero();
		//h1.name = "ミナト";
		//h1.hp = 100;

		//Hero h2 = new Hero();
		//h2.name = "アサカ";
		//h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}