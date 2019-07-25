package Clase5ProjectCajero;

import java.util.Scanner;

public class Cajero {
	protected int aasdasdasd;
	private float x=0,valor=500;
	
	public void ConsultarSaldo() {
		System.out.println("Tu saldo actual es: "+valor);
	}
	public void RetiroEfectivo() {
		Scanner in=new Scanner(System.in);
		System.out.println("Cuanto deseas retirar: ");
		x=in.nextFloat();
		valor=valor-x;
		ConsultarSaldo();
	}
	public void DepositoEfectivo() {
		Scanner in=new Scanner(System.in);
		System.out.println("Cuanto deseas depositar: ");
		x=in.nextFloat();
		valor=valor+x;
		ConsultarSaldo();
	}
}
