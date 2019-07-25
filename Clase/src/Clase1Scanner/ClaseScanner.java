package Clase1Scanner;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String nombre;
		System.out.println("diga su nombre");
		nombre=in.nextLine();
		System.out.println("Ahora su edad");
		int edad=in.nextInt();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}

}
