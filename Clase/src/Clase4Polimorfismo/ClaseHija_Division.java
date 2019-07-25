package Clase4Polimorfismo;

public class ClaseHija_Division extends ClasePadre{

	@Override
	public void Operaciones() {
		// TODO Auto-generated method stub
		if (b!=0) {
			r=a/b;
		}
		else
			System.out.println("ERROR");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		if(b!=0)
			System.out.println("Resultado: "+r);
	
	}

}
