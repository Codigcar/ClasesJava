package Clase7Thread;

public class Hilo extends Thread{

	private int p;
	private int n;
	
	public Hilo(int parametro,int inicial) {
		// TODO Auto-generated constructor stub
		p=parametro;
		n=inicial;
	}
	@Override
	public void run() {
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
	}
}
