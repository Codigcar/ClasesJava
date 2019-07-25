package Clase5ProjectCajero;

import java.util.Scanner;

public class main {

	public static int menu() {
		int opcion=0;
		Scanner in=new Scanner(System.in);
		System.out.println("1. Consulta de saldo");
		System.out.println("2. Retiro de efectivo");
		System.out.println("3. Deposito de efectivo");
		System.out.println("4. Salir");
		opcion=in.nextInt();
		return opcion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero cajero=new Cajero();
		boolean t=true;
		int op;
		while (t) {
			 op=menu();
			switch (op) {
			case 1:
				cajero.ConsultarSaldo();
				break;
			case 2:
				cajero.RetiroEfectivo();
				break;
			case 3:
				cajero.DepositoEfectivo();
				break;
			case 4:
				t=false;
				break;
			}
		}
		
	}

}
