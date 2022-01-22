import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class Computerwoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		int v0 = 0;
		int alpha = 0;
		boolean toFile = false;
		System.out.println("Initial velocity: ");
		Scanner sc = new Scanner(System.in);
		v0=sc.nextInt();
		System.out.println("Initial launch angle");
		alpha=sc.nextInt();
		System.out.println("Would you like to save? Yes or No");
		String read =sc.next();
		System.out.println(v0 + " " + alpha + " " + " " + read );
		System.out.println("pwd="+System.getProperty("user.di"));
		
		if(read.equalsIgnoreCase("YES") || read=="Yes") {
			
			toFile=true;
		}
		//CALCULATION
		System.out.println("SARA");
		final double GRAVITY = 9.807;
		double h_max = (v0*v0/2*GRAVITY);
		
		double x_max = (2*v0*Math.sin(alpha)/GRAVITY);
		
		//OUTOUT
		if(toFile) {
		System.out.println("DINS EL TO FILE");
			try {
				PrintWriter Writer = new PrintWriter("C:/Users/Sara/Desktop/a.out","UTF-8");
				Writer.println("Velocity=" + v0);
				Writer.println("Launch angle=" + alpha);
				Writer.println("Max height: " + h_max);
				Writer.println("Max Distance:" + x_max);
				Writer.close();
			} catch (FileNotFoundException | UnsupportedEncodingException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				System.out.println("CATCH");
			}
			
		}
		else {
			System.out.println(v0 +" "+ alpha +" "+h_max +" "+x_max+"");
		}
		
		sc.close();
		

	}

}
