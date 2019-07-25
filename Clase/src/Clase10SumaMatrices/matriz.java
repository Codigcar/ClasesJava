package Clase10SumaMatrices;

public class matriz {

	public static void main(String[] args) {

		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int matrizR[][] = new int[3][3];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz2[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matrizR[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz1[i][j]+",");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+",");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matrizR[i][j]+",");
			}
			System.out.println("");
		}
	}
}