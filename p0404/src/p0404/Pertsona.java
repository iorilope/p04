/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0404;

// TODO: Auto-generated Javadoc
/**
 * The Class Pertsona.
 */
public class Pertsona
{


	/** The id pertsona. */
	//4 atributo daude eta beran agertzen dira izenak
	private int    idPertsona;

	/** The Izena. */
	private String Izena;

	/** The Adina. */
	private int    Adina;

	/** The Generoa. */
	private String Generoa;

	/**
	 * Instantiates a new pertsona.
	 *
	 * @param id the id
	 * @param Izena the izena
	 * @param Adina the adina
	 */
	public Pertsona(int id, String Izena, int Adina)
	{
		setIdPertsona(id);
		setIzena(Izena);
		setAdina(Adina);
	}

	/**
	 * Instantiates a new pertsona.
	 */
	public Pertsona()
	{

	}

	/**
	 * Instantiates a new pertsona.
	 *
	 * @param id the id
	 * @param Izena the izena
	 * @param Adina the adina
	 * @param Generoa the generoa
	 */
	public Pertsona(int id, String Izena, int Adina, String Generoa)
	{
		setIdPertsona(id);
		setIzena(Izena);
		setAdina(Adina);
		setGeneroa(Generoa);
	}

	/**
	 * Sets the id pertsona.
	 *
	 * @param balioa the new id pertsona
	 */
	public void setIdPertsona(int balioa)
	{
		this.idPertsona = balioa;
	}

	/**
	 * Sets the izena.
	 *
	 * @param balioa the new izena
	 */
	public void setIzena(String balioa)
	{
		this.Izena = balioa;
	}

	/**
	 * Sets the generoa.
	 *
	 * @param balioa the new generoa
	 */
	public void setGeneroa(String balioa)
	{
		if (balioa.equals("G") || balioa.equals("E"))

			this.Generoa = balioa;
		else
			System.out.println("Generoa G edo E izan behar du");
	}

	/**
	 * Sets the adina.
	 *
	 * @param balioa the new adina
	 */
	public void setAdina(int balioa)
	{
		if (balioa < 55)

			this.Adina = balioa;
		else
			System.out.println("Adina < 55 izan behar du");
	}

	/**
	 * Gets the id pertsona.
	 *
	 * @return the id pertsona
	 */
	public int getIdPertsona()
	{
		return this.idPertsona;
	}

	/**
	 * Gets the izena.
	 *
	 * @return the izena
	 */
	public String getIzena()
	{
		return this.Izena;
	}

	/**
	 * Gets the adina.
	 *
	 * @return the adina
	 */
	public int getAdina()
	{
		return this.Adina;
	}

	/**
	 * Gets the generoa.
	 *
	 * @return the generoa
	 */
	public String getGeneroa()
	{
		return this.Generoa;
	}
}

//11 metodo daude eta eraikitzaileak 3 dira, 3 pertsona sortzen baitira


//Set metodoen bidez gure pertsonen atributoei balioak esleitzen ditugu eta get bidez balio horiek eskuratzen ditugu