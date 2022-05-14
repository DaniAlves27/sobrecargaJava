package sobrecargaJava;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----Sobrecarga------");
		quadrilatero.area(5);
		quadrilatero.area(4d, 5d);
		quadrilatero.area(5, 10, 15);
		quadrilatero.area(5f, 6f);

	}

}
