package sobrecargaJava;

public class quadrilatero {

	public static void area(int l) {

		double areaQ = l * l;

		System.out.println("A �rea do quadrado � : " + areaQ);

	}

	public static void area(double b, double h) {

		double areaR = b * h;

		System.out.println("A �rea do ret�ngulo � : " + areaR);

	}

	public static void area(double bMaior, double bMenor , double aLt) {

		double areaT = (bMaior + bMenor) * aLt / 2;

		System.out.println("A �rea do trap�zio � : " + areaT);

	}
	
	public static void area(float diagonal, float diagonal2) {

		double areaL = (diagonal * diagonal2) / 2;

		System.out.println("A �rea do los�ngo � : " + areaL);

	}
}
