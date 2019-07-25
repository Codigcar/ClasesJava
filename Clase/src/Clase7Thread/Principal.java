package Clase7Thread;

public class Principal {

	public static void main(String[] args) {
		
		Hilo thread=new Hilo(10,5);
		Hilo thread2=new Hilo(20,10);
		
		thread.start();
		//thread2.start();
	}
}
