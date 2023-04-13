package geometrija;

import java.io.*;

public abstract class Telo implements Comparable<Telo> {

	protected double r;
	protected static int broj = 0;
	
	public Telo() {
		
		this.r = 0;
		broj++;
		
	}
	
	public Telo(String ime) {
		
		try {
			FileInputStream fis = new FileInputStream(ime);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			for (int i = 0; i < broj; i++)
				dis.readDouble();
			this.r = dis.readDouble();
			dis.close();
			broj++;
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public abstract double zapremina();
	
	@Override
	public int compareTo(Telo t) {
		
		if (this.r < t.r)
			return -1;
		else if (this.r == t.r)
			return 0;
		else
			return 1;
	}
	
	public double getR() { return r; }

	public String toString() {
		
		return "Telo sa poluprecnikom: " + r;
		
	}
	
}
