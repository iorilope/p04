/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0406;

// TODO: Auto-generated Javadoc
/**
 * The Class Kotxea.
 */
class Kotxea
{

	/** The abiadura. */
	private static  int abiadura;

	/**
	 * Instantiates a new kotxea.
	 *
	 * @param a the a
	 */
	Kotxea(int a) 
	{
		abiadura = a;
	}

	/**
	 * Gets the abiadura.
	 *
	 * @return the abiadura
	 */
	public int getAbiadura() {

		return abiadura;
	}

	/**
	 * Azeleratu.
	 *
	 * @param v the v
	 */
	void azeleratu(int v) 
	{
		abiadura += v;
	}


	/**
	 * Balazta.
	 *
	 * @param z the z
	 */
	void balazta(int z) 
	{
		abiadura -= z;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){

		Kotxea kotxea = new Kotxea(0);

		System.out.println(kotxea.getAbiadura());

	}


}



