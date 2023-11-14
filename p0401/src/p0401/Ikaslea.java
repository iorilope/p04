package p0401;


class KudeatuIkasle {

	private String izena;
	private int adina;

	KudeatuIkasle(String n, int e) {	

		izena = n;
		adina = e;
	}

	public static void main (String[] args)  {

		KudeatuIkasle i1 = new KudeatuIkasle("Ane", 18);
		KudeatuIkasle i2 = new KudeatuIkasle("Jon", 21);


		System.out.println(i1.izena + " " + i1.adina);
		System.out.println(i2.izena + " " + i2.adina);
	}
}
