package geometrija;

import java.io.*;
import java.util.ArrayList;

public class Kolekcija {
	
	private ArrayList<Telo> lista;
	
	public Kolekcija(String ime) {
		
		lista = new ArrayList<>();
		
		try {
			FileOutputStream fos = new FileOutputStream(ime);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeDouble(9);
			dos.writeDouble(5);
			dos.writeDouble(3);
			dos.writeDouble(0);
			dos.writeDouble(1);
			dos.writeDouble(2);
			dos.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void dodaj(Telo t) throws NultoTelo {
		
		if(t.r == 0)
			throw new NultoTelo();
		
		lista.add(t);
		
	}
	
	public void print(String ime) {
		
		lista.sort(null);
		try {
			FileWriter fw = new FileWriter(ime);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Telo t : lista) {
				bw.write(t.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}

}
