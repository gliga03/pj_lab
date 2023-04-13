import geometrija.Kolekcija;
import geometrija.Kupa;
import geometrija.Lopta;
import geometrija.NultoTelo;
import geometrija.Telo;
import geometrija.Valjak;

public class Glavna {

	public static void main(String[] args) {
		
		Kolekcija k = new Kolekcija("fajl.bin");
		Telo t1 = new Valjak("fajl.bin");
		Telo t2 = new Kupa("fajl.bin");
		Telo t3 = new Lopta("fajl.bin");
		Telo t4 = new Valjak("fajl.bin");
		Telo t5 = new Kupa("fajl.bin");
		Telo t6 = new Lopta("fajl.bin");

		try {
			k.dodaj(t1);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		try {
			k.dodaj(t2);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		try {
			k.dodaj(t3);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		try {
			k.dodaj(t4);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		try {
			k.dodaj(t5);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		try {
			k.dodaj(t6);
		} catch (NultoTelo e) {
			System.out.println(e.toString());
		}

		k.print("tekstfajl.txt");
		
	}
	
}
