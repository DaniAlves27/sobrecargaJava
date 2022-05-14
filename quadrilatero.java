package sobrecargaJava;

public class quadrilatero {

	public static void area(int l) {

		double areaQ = l * l;

		System.out.println("A área do quadrado é : " + areaQ);

	}

	public static void area(double b, double h) {

		double areaR = b * h;

		System.out.println("A área do retângulo é : " + areaR);

	}

	public static void area(double bMaior, double bMenor , double aLt) {

		double areaT = (bMaior + bMenor) * aLt / 2;

		System.out.println("A área do trapézio é : " + areaT);

	}
	
	public static void area(float diagonal, float diagonal2) {

		double areaL = (diagonal * diagonal2) / 2;

		System.out.println("A área do losângo é : " + areaL);

	}
}
