package Clase6TryCatch;

import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=0,b=0,r=0;
		try {
			System.out.println("first value");
			a=in.nextInt();
			System.out.println("second value");
			b=in.nextInt();
			r=a/b;
			
			System.out.println("Resultado: "+r);
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR: "+e);
		}finally {
			System.out.println("Este code si o si aparece");
		}
	}

	
}
