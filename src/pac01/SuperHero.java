package pac01;

public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した！");
	}
	public SuperHero(String name) {
		this.hp = 100;	// hpフィールドを100で初期化
		this.name = name;	// 引数の値でnameフィールドを初期化
	}
}
