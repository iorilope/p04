/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0411;

// TODO: Auto-generated Javadoc
/**
 * The Class Zenbakia.
 */
public class Zenbakia {

	/** The H zenbakia. */
	private static int HZenbakia;

	/** The Zenbakia 2. */
	private static int Zenbakia2;

	/**
	 * Instantiates a new zenbakia.
	 */
	Zenbakia () 
	{
	}

	/**
	 * Gehitu.
	 *
	 * @return the int
	 */
	public int Gehitu() {
		Zenbakia2 = HZenbakia + 5 ;
		return Zenbakia2;
	}

	/**
	 * Kendu.
	 *
	 * @return the int
	 */
	public int Kendu() {
		Zenbakia2 = HZenbakia -2 ;
		return Zenbakia2;
	}


	/**
	 * Gets the balioa.
	 *
	 * @return the balioa
	 */
	public int getbalioa() {
		return HZenbakia;
	}

	/**
	 * Gets the zenbakiax 2.
	 *
	 * @return the zenbakiax 2
	 */
	public int getZenbakiax2() {
		return HZenbakia * 2;
	}

	/**
	 * Gets the zenbakiax 3.
	 *
	 * @return the zenbakiax 3
	 */
	public int getZenbakiax3() {
		return HZenbakia * 3;
	}

	/**
	 * Sets the zenbakia.
	 *
	 * @param c the new zenbakia
	 */
	public  void setZenbakia( int c ) {
		HZenbakia = c;
	}


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {


		Zenbakia zenbakia = new Zenbakia();
		zenbakia.setZenbakia(5);

		System.out.println(zenbakia.Gehitu());
		System.out.println(zenbakia.Kendu());
		System.out.println(zenbakia.getbalioa());
		System.out.println(zenbakia.getZenbakiax2());
		System.out.println(zenbakia.getZenbakiax3());

	}

}
