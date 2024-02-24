class pattern {

	public void show1() {

		// lets Print * * * *
		for (int i = 0; i <= 4; i++) {
			System.out.print("*" + " ");

		}
	}

	public void show2() {
		/*
		 * now print * * * * * * * * * * * *
		 * 
		 */

		int n = 4;
		for (int j = 0; j < 4; j++) {

			for (int i = 0; i < 4; i++) {

				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}

public class Solutio2 {

	public static void main(String[] args) {
		// System.out.println(); // Vs println();

		pattern p = new pattern();
		p.show1();
		System.out.println();
		System.out.println();

		System.out.println();

		p.show2();

	}

}
