package Clase3Herencia;

import java.util.Scanner;

public class ClasePadre {

	Scanner in=new Scanner(System.in);
	protected int a,b,resultado;
	
	public void PedirDatos() {
		System.out.println("first value enter");
		a=in.nextInt();
		System.out.println("Second value enter");
		b=in.nextInt();
	}
	public void ShowResult() {
		System.out.println("Result: "+ resultado);
	}
}
