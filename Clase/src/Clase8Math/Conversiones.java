package Clase8Math;

public class Conversiones {

	public static void main(String[] args) {
		double anguloEnGrados=45;
		
		double anguloEnRadianes=Math.toRadians(anguloEnGrados);
		System.out.println("45 a Radianes: "+ anguloEnRadianes);
		
		anguloEnGrados=Math.toDegrees(anguloEnRadianes);
		System.out.println("Rad a Gradianes: "+anguloEnGrados);
	}
}
