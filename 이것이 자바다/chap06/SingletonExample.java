package sec10;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		// obj1과 obj2는 같은 객체이다.

	}
}
