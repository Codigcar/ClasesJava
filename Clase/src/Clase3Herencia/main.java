package Clase3Herencia;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseHija_Resta obj_resta=new ClaseHija_Resta();
		ClaseHija_Suma obj_suma=new ClaseHija_Suma();
		
		obj_suma.PedirDatos();
		obj_suma.suma();
		obj_suma.ShowResult();
	}

}
