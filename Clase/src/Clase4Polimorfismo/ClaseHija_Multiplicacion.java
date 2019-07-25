package Clase4Polimorfismo;

public class ClaseHija_Multiplicacion extends ClasePadre{

	@Override
	public void Operaciones() {
		// TODO Auto-generated method stub
		r=a*b;
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Resultado: "+r);
	}

}
