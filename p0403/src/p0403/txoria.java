/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0403;

// TODO: Auto-generated Javadoc
/**
 * The Class txoria.
 */
class txoria
{

	/** The kolorea. */
	//Baloreak statiko bezela ezarri ditugu  bestela klase estatikoetatik ezingo degu akzeditu aldagaietara
	private static char kolorea;

	/** The adina. */
	private static int adina;

	/**
	 * Instantiates a new txoria.
	 *
	 * @param k the k
	 * @param a the a
	 */
	public txoria (char k, int a) 
	{
		kolorea = k; 
		adina = a; 
	}

	/**
	 * Sets the color.
	 *
	 * @param c the new color
	 */
	//Adina esleitu eta kolorea esleitu
	public void setColor( char c ) 
	{
		kolorea = c;
	}

	/**
	 * Sets the adina.
	 *
	 * @param b the new adina
	 */
	public void setAdina( int b ) 
	{
		adina = b;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public char getColor() 
	{
		return kolorea;
	}

	/**
	 * Gets the adina.
	 *
	 * @return the adina
	 */
	public int getAdina() 
	{
		return adina;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){


		txoria txoria = new txoria('A', 20);

		System.out.println(txoria.getColor());
		System.out.println(txoria.getAdina());



	}





}