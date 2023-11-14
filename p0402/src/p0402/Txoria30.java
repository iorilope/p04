/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0402;

// TODO: Auto-generated Javadoc
/**
 * The Class Txoria30.
 */
public class Txoria30 {


	//**** atributuak edo propietateak****

	/** The zenbat txori. */
	private static int zenbatTxori= 0;

	/** The kolorea. */
	private char kolorea;    

	/** The adina. */
	private int adina;         

	//**** klaseko metodoak***


	//Kontagailu honen bidez txori berri bat sartzean kopurua jakitea daukagu

	/**
	 * Txori berria.
	 */
	static void txoriBerria() {
		zenbatTxori++;
	};

	/**
	 * Instantiates a new txoria 30.
	 */
	//Txori berri bat sartzen dugu
	Txoria30() 
	{
		kolorea= 'b'; 
		adina = 0; 
		txoriBerria();
	}


	/**
	 * Instantiates a new txoria 30.
	 *
	 * @param k the k
	 * @param a the a
	 */
	Txoria30 (char k, int a) {
		kolorea = k; 
		adina = a; 
		txoriBerria();
	}

	//Txori kopurua erakusten da erabiltzaileari

	/**
	 * Erakutsi txoriak.
	 */
	static void erakutsiTxoriak() {
		System.out.println (zenbatTxori);
	};


	//Txoria30-ean 2 txori gordetzen ditugu beraz inprimatuko duena txori kopurua izango da, txoria erakutsi baino lehen balio berriak sartzen baditugu kontagailua igoko da

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String [] args) 
	{

		//Ezin dezakegu p1 eta p2 kendu erreferentziatik bestela aldagai horiek ezingo ditu ulertu
		Txoria30 p1, p2;

		p1 = new Txoria30 ();
		p2 = new Txoria30 ('u', 3);

		p1.erakutsiTxoriak();
		p2.erakutsiTxoriak();

	}
}
