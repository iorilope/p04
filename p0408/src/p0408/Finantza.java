/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0408;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Finantza.
 */
class Finantza {


	/** The trukea. */
	private double trukea = 0;

	/**
	 * Instantiates a new finantza.
	 */
	Finantza() 
	{
		trukea = 1.36;
	}


	/**
	 * Instantiates a new finantza.
	 *
	 * @param trukea the trukea
	 */
	Finantza(double trukea) 
	{	
		this.trukea = trukea;

	}

	/**
	 * Dolar to euro.
	 *
	 * @param dirua the dirua
	 * @return the double
	 */
	public  double dolarToEuro(double dirua) 
	{
		return dirua/trukea;
	}

	/**
	 * Euro to dolar.
	 *
	 * @param dirua the dirua
	 * @return the double
	 */
	public   double euroToDolar(double dirua) 
	{
		return trukea*dirua;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){


		Finantza f1 = new Finantza();


		Scanner sc = new Scanner(System.in);
		System.out.print("Sartu euro kopurua bihurtzeko: ");
		double dirua = sc.nextDouble();
		sc.close();

		double dolarrak = f1.dolarToEuro(dirua);

		System.out.println(dirua + " euroa dira " + dolarrak + " dolar.");
	}

}
