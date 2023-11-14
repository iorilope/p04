/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0405;

// TODO: Auto-generated Javadoc
/**
 * The Class Satelite.
 */
public class Satelite {

	/** The meridiano. */
	private double meridiano;

	/** The paralelo. */
	private double paralelo;

	/** The ditantzia lurra. */
	private double ditantzia_lurra;

	/**
	 * Instantiates a new satelite.
	 *
	 * @param m the m
	 * @param p the p
	 * @param d the d
	 */
	Satelite (double m,double p,double d){

		meridiano=m;
		paralelo=p;
		ditantzia_lurra=d;
	}

	/**
	 * Instantiates a new satelite.
	 */
	Satelite (){

		meridiano=paralelo=ditantzia_lurra=0;
	}

	/**
	 * Sets the posicion.
	 *
	 * @param m the m
	 * @param p the p
	 * @param d the d
	 */
	public void setPosicion(double m,double p,double d){

		meridiano=m;
		paralelo=p;
		ditantzia_lurra =d;
	}

	/**
	 * Prints the posicion.
	 */
	public void printPosicion(){

		System.out.println("Satelitea honako kokapenean dago: paraleloa" + paralelo +"Meridiano " + meridiano +  "eta lurretik" + ditantzia_lurra + "Kilmetro");
	}
}