/*
 * 2023(e)ko aza. 10(a)
 * Ioritz Lopetegi
 */
package p0404;

// TODO: Auto-generated Javadoc
/**
 * The Class PertsonaKudeaketa.
 */
public class PertsonaKudeaketa
{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		Pertsona p1 = new Pertsona(22, "Koldo", 12);

		p1.setGeneroa("E");

		Pertsona p2 = new Pertsona(33, "Lutxi", 34, "F");
		Pertsona p3 = new Pertsona(44, "Ana", 25, "E");

		System.out.print("id: " + p1.getIdPertsona() + " Izena: " + p1.getIzena() + " Adina: " + p1.getAdina());

		System.out.println(" Generoa: " + p1.getGeneroa());


		System.out.println("id: " + p2.getIdPertsona() + " Izena: " + p2.getIzena() + " Adina: "
				+ p2.getAdina() + " Generoa: " + p2.getGeneroa());


		System.out.println("id: " + p3.getIdPertsona() + " Izena: " + p3.getIzena() + " Adina: "
				+ p3.getAdina() + " Generoa: " + p3.getGeneroa());

	}
}