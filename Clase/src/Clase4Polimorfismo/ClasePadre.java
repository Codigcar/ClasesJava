package Clase4Polimorfismo;

import java.util.Scanner;

public abstract class ClasePadre {
	
	Scanner in=new Scanner(System.in);
	protected int a,b,r;
	
	public void PedirDatos() {
		System.out.println("first value: ");
		a=in.nextInt();
		System.out.println("second value");
		b=in.nextInt();
	}
	public abstract void Operaciones();
	
	public abstract void Show();
	
}
