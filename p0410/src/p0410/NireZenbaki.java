/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0410;



// TODO: Auto-generated Javadoc
/**
 * The Class NireZenbaki.
 */
class NireZenbaki {

	/** The H zenbakia. */
	private static int HZenbakia;

	/**
	 * Instantiates a new nire zenbaki.
	 *
	 * @param a the a
	 */
	NireZenbaki (int a) 
	{
		HZenbakia =  a; 
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
	 * Gets the zenbakiax 4.
	 *
	 * @return the zenbakiax 4
	 */
	public int getZenbakiax4() {
		return HZenbakia * 4;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){


		NireZenbaki zenbakia = new NireZenbaki(5);

		System.out.println(zenbakia.getZenbakiax2());
		System.out.println(zenbakia.getZenbakiax3());
		System.out.println(zenbakia.getZenbakiax4());



	}

}
