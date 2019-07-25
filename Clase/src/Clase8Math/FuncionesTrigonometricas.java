package Clase8Math;

public class FuncionesTrigonometricas {

	public static void main(String[] args) {
		double resultado =0;
		double anguloEnGrados=45;
		double anguloEnRadianes=Math.toRadians(anguloEnGrados);
		
		//seno de 45
		//las funciones trigo. solo van como parametros a valores en radianes
		resultado=Math.sin(anguloEnRadianes);
		System.out.println("Seno de : "+anguloEnGrados+ " = "+resultado);
		
		//coseno
		
		resultado=Math.cos(anguloEnRadianes);
		System.out.println("Coseno de : "+anguloEnGrados+ " = "+resultado);
		
		//tangente
		
		resultado=Math.tan(anguloEnRadianes);
		System.out.println("Tangente	 de : "+anguloEnGrados+ " = "+resultado);
		
	
		
	}
	
}
