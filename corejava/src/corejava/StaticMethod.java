package corejava;

public class StaticMethod {

	static int a = 23, b;

	{
		System.out.println("Block 1");
	}

	static void math(int x) {
		System.out.println("X : " + x);
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}

	static {
		System.out.println("Static Block Initialized");
		b = a * 4;
	}

	{
		System.out.println("BLock 2");
	}

	public StaticMethod() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		math(45);
		StaticMethod s = new StaticMethod();
	}
}
