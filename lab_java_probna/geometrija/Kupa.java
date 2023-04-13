package geometrija;

public class Kupa extends Telo {

	private double h;
	
	public Kupa(String ime) {
		
		super(ime);
		this.h = Math.random() * 10;
		
	}

	@Override
	public double zapremina() {
		return (1.0/3.0) * r*r*h*Math.PI;
	}
	
	public String toString() {
		
		return "Kupa sa zapreminom: " + zapremina() + ", r = " + r + ", h = " + h;
		
	}
	
}
